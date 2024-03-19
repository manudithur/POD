package ar.edu.itba.pod.concurrency.tp2;

public class SafeStack {
    private static final int MAX_SIZE = 2000;
    private String lock = "lock";
    private int top = 0;
    private final int[] values = new int[MAX_SIZE];
    public void push(final int n) {
        synchronized (lock) {
            if (top == MAX_SIZE) {
                throw new IllegalStateException("stack full");
            }
            values[top++] = n;
        }
    }
    public int pop() {
        synchronized (lock) {
            if (top == 0) {
                throw new IllegalStateException("stack empty");
            }
            return values[--top];
        }

    }
    public int size() {
        synchronized (lock) {
            return top;
        }
    }
}
