package ar.edu.itba.pod.concurrency.threadSafety.e1;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import ar.edu.itba.pod.concurrency.service.GenericService;
import ar.edu.itba.pod.concurrency.service.GenericServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for {@link GenericService} using {@link Thread}s
 */
public class GenericServiceConcurrencyTest {
    private static final int VISITS_BY_THREAD = 5;
    private static final int THREAD_COUNT = 5;
    private static final int EXPECTED_VISITS = 25;

    private GenericService service;

    @BeforeEach
    public final void before() {
        service = new GenericServiceImpl();
    }

    /**
     * Makes VISITS_BY_THREAD visits to the service
     */
    private final Runnable visitor = () -> {
        for(int i = 0; i < VISITS_BY_THREAD; i++) {
            service.addVisit();
        }
    };

    private ExecutorService pool;

    /**
     * generates THREAD_COUNT threads with {@link #visitor} and runs them.
     */
    @Test
    public final void visit_count_with_thread_start() throws InterruptedException {
        Thread[] threads = new Thread[THREAD_COUNT];
        for(int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(visitor);
            threads[i].start();
        }
        for(int i = 0; i < THREAD_COUNT; i++) {
            threads[i].join();
        }
        assertEquals(EXPECTED_VISITS, service.getVisitCount());
    }

    /**
     * generates THREAD_COUNT threads with {@link #visitor} and runs them submiting it via
     * the {@link ExecutorService}
     */
    @Test
    public final void visit_count_with_executor_submit() throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        for(int i = 0; i < THREAD_COUNT; i++) {
            pool.submit(visitor);
        }
        pool.shutdown();
        pool.awaitTermination(2, TimeUnit.MINUTES);
        assertEquals(EXPECTED_VISITS, service.getVisitCount());
    }
}