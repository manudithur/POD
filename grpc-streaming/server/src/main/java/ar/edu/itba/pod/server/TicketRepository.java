package ar.edu.itba.pod.server;


import ar.edu.itba.pod.grpc.trainTickets.Ticket;
import ar.edu.itba.pod.grpc.trainTickets.Train;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TicketRepository {
    private static final String[] destinations = {"Mar del Plata", "Rosario", "Cordoba", "Tucuman"};
    private static final Random random = new Random();

    private final Map<String, List<Train>> trainsByDestination;

    private final Map<String, List<Ticket>> reservations;

    public TicketRepository() {
        trainsByDestination = new HashMap<>();
        reservations = new HashMap<>();

        for (int i = 0; i < destinations.length; i++) {
            final String destination = destinations[i];
            final List<Train> trainList = IntStream.range(1, random.nextInt(1, 5)).mapToObj(index ->
                Train.newBuilder()
                    .setId(UUID.randomUUID().toString())
                    .setDestination(destination)
                    .setTime(random.nextInt(0, 24) + ":" + random.nextInt(0, 60))
                    .setAvailableCount(random.nextInt(1, 100))
                    .build()
            ).collect(Collectors.toList());

            trainsByDestination.put(destination, trainList);
        }
    }

    public List<String> getDestinations() {
        return List.of(destinations);
    }

    public List<Train> getAvailability(final String destination) {
        return trainsByDestination.get(destination);
    }

    public String addReservation(List<Ticket> tickets) {
        final String reservationId = UUID.randomUUID().toString();
        reservations.put(reservationId, tickets);

        return reservationId;
    }

    public Optional<List<Ticket>> getReservation(final String id) {
        return Optional.ofNullable(reservations.get(id));
    }



}

