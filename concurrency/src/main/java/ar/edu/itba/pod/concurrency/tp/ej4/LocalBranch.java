package ar.edu.itba.pod.concurrency.tp.ej4;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class LocalBranch {
    private static Integer AMOUNT_OF_CLIENTS = 200;
    private static Integer AMOUNT_OF_RECEPTIONIST = 2;
    private static Integer AMOUNT_OF_ATTENDANTS_HIGH = 3;
    private static Integer AMOUNT_OF_ATTENDANTS_PRIORITY = 1;
    private static Integer AMOUNT_OF_ATTENDANTS_NORMAL = 2;
    public static void main(String[] args) {
        IBranchClientQueueService clientQueueService = new ClientQueueServiceImpl(AMOUNT_OF_CLIENTS);

        ExecutorService receptionistService =  newFixedThreadPool(AMOUNT_OF_RECEPTIONIST);

        for (int i = 0; i < AMOUNT_OF_RECEPTIONIST; i++) {
            receptionistService.submit(new Receptionist(clientQueueService, i));
        }

        ExecutorService attendantService = newFixedThreadPool(AMOUNT_OF_ATTENDANTS_HIGH + AMOUNT_OF_ATTENDANTS_PRIORITY + AMOUNT_OF_ATTENDANTS_NORMAL);

        for (int i = 0; i < AMOUNT_OF_ATTENDANTS_HIGH; i++) {
            attendantService.submit(new ClientAttendant(clientQueueService, ClientPriority.HIGH));
        }

        for (int i = 0; i < AMOUNT_OF_ATTENDANTS_PRIORITY; i++) {
            attendantService.submit(new ClientAttendant(clientQueueService, ClientPriority.PRIORITY));
        }

        for (int i = 0; i < AMOUNT_OF_ATTENDANTS_NORMAL; i++) {
            attendantService.submit(new ClientAttendant(clientQueueService, ClientPriority.NORMAL));
        }

        receptionistService.shutdown();
        attendantService.shutdown();


    }
}