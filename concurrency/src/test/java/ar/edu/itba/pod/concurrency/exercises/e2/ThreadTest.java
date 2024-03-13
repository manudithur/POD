package ar.edu.itba.pod.concurrency.exercises.e2;

import ar.edu.itba.pod.concurrency.exercises.e1.GenericService;
import ar.edu.itba.pod.concurrency.exercises.e1.GenericServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreadTest {
    private static final int VISIT_COUNT = 5;

    private GenericService service;

    @BeforeEach
    public final void before() {
        service = new GenericServiceImpl();
    }

    @Test
    public final void testThread() {
        // 1. Arrange
        final Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < VISIT_COUNT; i++) {
                    service.addVisit();
                }
            }
        };

        // 2. Act
        thread.start();

        // 3. Assert
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(VISIT_COUNT, service.getVisitCount());
    }

    @Test
    public final void testRunnable() {
        // 1. Arrange
        final Runnable runnable = () -> {
            for (int i = 0; i < VISIT_COUNT; i++) {
                service.addVisit();
            }
        };

        // 2. Act
        final Thread thread = new Thread(runnable);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 3. Assert
        assertEquals(VISIT_COUNT, service.getVisitCount());
    }

    @Test
    public final void testLambda() {
        // 1. Arrange
        final Thread thread = new Thread(() -> {
            for (int i = 0; i < VISIT_COUNT; i++) {
                service.addVisit();
            }
        });

        // 2. Act
        thread.start();

        // 3. Assert
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(VISIT_COUNT, service.getVisitCount());
    }
}
