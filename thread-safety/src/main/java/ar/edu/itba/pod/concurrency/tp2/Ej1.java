package ar.edu.itba.pod.concurrency.tp2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ej1 {

    private static final int VISITS_BY_THREAD = 20;
    private static final int THREAD_COUNT = 100;
    private static final int EXPECTED_VISITS = 2000;
    public static void main(String[] args) {

        Stack stack = new Stack();

        final Runnable visitor = () -> {
            for(int i = 0; i < VISITS_BY_THREAD; i++) {
                stack.push(i);
            }
        };

        ExecutorService pool = Executors.newCachedThreadPool();
        for(int i = 0; i < THREAD_COUNT; i++) {
            pool.submit(visitor);
        }

        pool.shutdown();

        try{
            pool.awaitTermination(2, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(stack.size());
        System.out.println(EXPECTED_VISITS);

    }
}
