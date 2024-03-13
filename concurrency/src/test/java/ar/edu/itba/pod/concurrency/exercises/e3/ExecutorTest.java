package ar.edu.itba.pod.concurrency.exercises.e3;

import ar.edu.itba.pod.concurrency.exercises.e1.GenericService;
import ar.edu.itba.pod.concurrency.exercises.e1.GenericServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExecutorTest {
    private final static int VISIT_COUNT = 5;

    private GenericService service;
    private ExecutorService pool;

    @BeforeEach
    public final void before() {
        service = new GenericServiceImpl();
        pool = Executors.newCachedThreadPool();
    }

    @Test
    public final void test() throws ExecutionException, InterruptedException {
        // 1. Arrange

        // 2. Act
        final Future<Integer> result = pool.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                for(int i = 0; i < VISIT_COUNT; i++) {
                    service.addVisit();
                }

                return service.getVisitCount();
            }
        });

        // 3. Assert
        assertEquals(VISIT_COUNT, result.get());
    }
}
