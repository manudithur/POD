package ar.edu.itba.pod.concurrency.tp.ej4;

import java.util.concurrent.Callable;

public class ClientAttendant implements Callable<Integer > {
    private final IBranchClientQueueService clientService;
    private final ClientPriority priority;
    public ClientAttendant(IBranchClientQueueService clientService,
                           ClientPriority priority) {
        this.clientService = clientService;
        this.priority = priority;
    }
    @Override
    public Integer call() throws Exception {
        boolean stillWorking = true;
        int cycles = 0;
        int clientsAttended = 0;
        while (stillWorking) {
            //if 3 cycles with no client end.

            cycles++;

            if(cycles == 3){
                stillWorking = false;
            }

            //get client for priority

            Client client = clientService.clientForPriority(priority);

            //get one client and sleep for random amount of seconds to simulate service time

            if(client != null){
                Thread.sleep((long) (Math.random() * 1000));
                clientsAttended++;
                System.out.println("Client attended: " + client.name() + " with priority " + client.priority().name());
                cycles = 0;
            }
            else{
                Thread.sleep(3000);
            }
            // or if no client sleep to simulate waiting time.

        }
        return clientsAttended;
    }
}