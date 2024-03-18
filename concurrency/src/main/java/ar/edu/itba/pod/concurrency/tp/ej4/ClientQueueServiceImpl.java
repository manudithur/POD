package ar.edu.itba.pod.concurrency.tp.ej4;

import java.util.PriorityQueue;
import java.util.Queue;

public class ClientQueueServiceImpl implements IBranchClientQueueService{
    private final Queue<Client> clients;

    public ClientQueueServiceImpl(int size) {
        this.clients = new PriorityQueue<>(size, (c1, c2) -> c2.priority().compareTo(c1.priority()));
    }

    @Override
    public void receiveClient(Client client) {
        clients.add(client);
    }

    @Override
    public Client clientForPriority(ClientPriority priority) {
        return clients.poll();
    }
}
