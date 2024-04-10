package ar.edu.itba.pod.server;

import ar.edu.itba.pod.grpc.trainTickets.*;
import com.google.protobuf.Empty;
import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class TrainServant extends TrainTicketServiceGrpc.TrainTicketServiceImplBase {
    private final TicketRepository ticketRepository;

    public TrainServant(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void getTrainsForDestination(StringValue request, StreamObserver<Train> responseObserver) {
        List<Train> trains = ticketRepository.getAvailability(request.getValue());
        trains.forEach(responseObserver::onNext);
        responseObserver.onCompleted();
    }

    @Override
    public void getDestinations(Empty request, StreamObserver<Destinations> responseObserver) {
        List<String> destinations = ticketRepository.getDestinations();
        responseObserver.onNext(Destinations.newBuilder().addAllDestinations(destinations).build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Ticket> purchaseTicket(StreamObserver<Reservation> responseObserver) {
        return new StreamObserver<>() {
            final List<Ticket> tickets = new ArrayList<>();

            @Override
            public void onNext(Ticket value) {
                tickets.add(value);
                System.out.println("Ticket purchased: " + value.getPassengerName());
            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onError(throwable);
            }

            @Override
            public void onCompleted() {
                final String reservationId = ticketRepository.addReservation(tickets);
                responseObserver.onNext(Reservation.newBuilder().setId(reservationId).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Reservation> getTicketsForReservations(StreamObserver<Ticket> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(Reservation value) {
                ticketRepository.getReservation(value.getId()).ifPresent(tickets -> tickets.forEach(responseObserver::onNext));
            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onError(throwable);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
