package ar.edu.itba.pod.concurrency.tp.e1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// imports
public class ConcurrentThreads {
    public static class T1 implements Runnable {
        @Override
        public void run() {
            System.out.print("A");
            System.out.print("B");
        }
    }
    public static class T2 implements Runnable {
        @Override
        public void run() {
            System.out.print("1");
            System.out.print("2");
        }
    }
    public static void main(final String[] args) {
        final ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            pool.execute(new T1());
            pool.execute(new T2());
//            pool.shutdown();
            if (!pool.awaitTermination(3000, TimeUnit.MILLISECONDS)) {
                pool.shutdownNow();
            }
        } catch (InterruptedException e) {
            pool.shutdownNow();
        }
    }
}