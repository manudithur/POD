package ar.edu.itba.pod.concurrency.exercises.e1;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

/**
 * Basic implementation of {@link GenericService}.
 */
public  class GenericServiceImpl implements GenericService {
    private int visits;
    private final Queue<String> queue;

    public GenericServiceImpl() {
        this.visits = 0;
        this.queue = new LinkedList<>();
    }

    @Override
    public String echo(String message) {
        return message;
    }

    @Override
    public String toUpper(String message) {
        return Optional.ofNullable(message).map(String::toUpperCase).orElse(null);
    }

    @Override
    public void addVisit() {
        this.visits += 1;
    }

    @Override
    public int getVisitCount() {
        return this.visits;
    }

    @Override
    public boolean isServiceQueueEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void addToServiceQueue(String name) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        queue.add(name);
    }

    @Override
    public String getFirstInServiceQueue() {
        return Optional.ofNullable(queue.poll()).orElseThrow(() -> new IllegalStateException("No one in queue"));
    }
}
