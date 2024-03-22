package ar.edu.itba.pod.concurrency.iii.e3;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Benchmar to compare between {@link Arrays#parallelSort(int[])} and
 * {@link Arrays#sort(int[])}
 */
public class SortBenchmark {

    @Test
    public void benchmark_all() {
        final Consumer<int[]> serialSort = arr -> Arrays.sort(arr);
        final Consumer<int[]> parallelSort = arr -> Arrays.parallelSort(arr);
        final int multiplier = 10000;
        final Random random = new Random();

        final int[] small = generateArray(10 * multiplier, random);
        final int[] medium = generateArray(25 * multiplier, random);
        final int[] large = generateArray(50 * multiplier, random);

        benchmark("Small serial", small, serialSort, parallelSort);
        benchmark("Medium serial", medium, serialSort, parallelSort);
        benchmark("Large serial", large, serialSort, parallelSort);

        benchmark("Small parallel", small, parallelSort, serialSort);
        benchmark("Medium parallel", medium, parallelSort, serialSort);
        benchmark("Large parallel", large, parallelSort, serialSort);
    }

    private  int[] generateArray(int size, Random random) {
        final int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    private void benchmark(String name, int[] arr, Consumer<int[]> first, Consumer<int[]> second) {
        long accumulate = 0;
        for (int i = 0; i < 30; i++) {
            final long start = System.currentTimeMillis();
            first.accept(Arrays.copyOf(arr, arr.length));
            final long end = System.currentTimeMillis();
            accumulate += end - start;
        }
        System.out.println(name + " first: " + accumulate / 30 + "ms");  ;
    }

}
