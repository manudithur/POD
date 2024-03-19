package ar.edu.itba.pod.concurrency.tp2;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class LineCounter {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String directoryPath = "src/main/java/ar/edu/itba/pod/concurrency/tp2";

        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            System.out.println("The provided path is not a directory.");
            System.exit(1);
        }

        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("Could not list the files in the directory.");
            System.exit(1);
        }

        ExecutorService executor = Executors.newCachedThreadPool();
        List<Future<Integer>> results = new ArrayList<>();

        for (File file : files) {
            // Submit a task for each file to count its lines
            results.add(executor.submit(() -> countLines(file)));
        }

        int totalLines = 0;
        for (Future<Integer> result : results) {
            // Sum up the line counts from each file
            totalLines += result.get();
        }

        executor.shutdown(); // Shutdown the executor service

        System.out.println("Total lines: " + totalLines);
    }

    private static int countLines(File file) {
        if (file.isDirectory()) {
            return 0; // Return 0 for directories
        }

        int lines = 0;
        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            while (reader.readLine() != null) {
                lines++;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getPath());
        }

        return lines;
    }
}
