package ar.edu.itba.pod.concurrency.exercises.e1;

public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        Thread thread = new HelloThread();

        System.out.println("Antes del thread");

        // thread.run(); // esto llama al metodo run() del thread, pero no lo ejecuta en un nuevo hilo
        thread.start(); // esto ejecuta el metodo run() en un nuevo hilo

        System.out.println("Despues del thread");
    }
}
