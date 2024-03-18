package ar.edu.itba.pod.concurrency.tp.ej4;

import java.util.concurrent.Callable;

// imports
public class Receptionist implements Callable<Integer > {
    private static final Integer AMOUNT_OF_CLIENTS = 100;
    private final IBranchClientQueueService clientService;

    private int receptionistId;
    public Receptionist(final IBranchClientQueueService clientService, int receptionistId) {
        this.clientService = clientService;
        this.receptionistId = receptionistId;
    }
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < AMOUNT_OF_CLIENTS; i++) {
            ClientPriority priority = ClientPriority.values()[(int) (Math.random() * ClientPriority.values().length)];
            clientService.receiveClient(new Client("Client " + i, priority));
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println("Client arrived: Client " + (receptionistId*AMOUNT_OF_CLIENTS + i) + " with priority " + priority.name());
        }

        return AMOUNT_OF_CLIENTS;
    }
}
