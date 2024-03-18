package ar.edu.itba.pod.concurrency.tp.ej4;

import java.util.Queue;

public interface IBranchClientQueueService{
    void receiveClient(Client client);
    Client clientForPriority(ClientPriority priority);

}
