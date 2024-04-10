package ar.edu.itba.pod.client;

import ar.edu.itba.pod.grpc.trainTickets.Reservation;
import ar.edu.itba.pod.grpc.trainTickets.Ticket;
import ar.edu.itba.pod.grpc.trainTickets.Train;
import ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceGrpc;
import com.google.protobuf.StringValue;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Client {
    private static Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) throws InterruptedException {
        logger.info("grpc-streaming Client Starting ...");
        logger.info("grpc-com-patterns Client Starting ...");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        try {
            final TrainTicketServiceGrpc.TrainTicketServiceStub trainTicketServiceStub = TrainTicketServiceGrpc.newStub(channel);
            final CompletableFuture<Reservation> reservation = new CompletableFuture<>();
            final StreamObserver<Reservation> response = new StreamObserver<Reservation>() {
                @Override
                public void onNext(final Reservation r) {
                    reservation.complete(r);
                }

                @Override
                public void onError(Throwable throwable) {
                    reservation.completeExceptionally(throwable);
                }

                @Override
                public void onCompleted() {
                    logger.info("Reservation completed");
                }
            };
            final StreamObserver<Ticket> ticketStreamObserver = trainTicketServiceStub.purchaseTicket(response);

            final List<String> names = List.of("Mar del Plata", "Rosario", "Cordoba", "Tucuman");

            names.forEach(name -> {
                final Ticket ticket = Ticket.newBuilder().setPassengerName(name).build();
                ticketStreamObserver.onNext(ticket);
            });

            ticketStreamObserver.onCompleted();
            System.out.println(reservation.get().getId());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            channel.shutdown().awaitTermination(10, TimeUnit.SECONDS);
        }
    }
}
