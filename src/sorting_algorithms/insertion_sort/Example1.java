package sorting_algorithms.insertion_sort;

import timer.StopWatch;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        int[] array = new int[1000_000];
        // 46.363 seconds for 1 million elements
        Random generator = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(1000_001);
        }
        StopWatch watch = new StopWatch();
        System.out.println("Before sorting: ");
        //printArray(array);
        watch.start();
        insertionSort(array);

        System.out.println("After sorting: ");
        //printArray(array);
        watch.stop();
        watch.printElapsedTime();
    }

    public static void printArray(int[] arr) {

        for (var item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            int pivot = arr[j];

            while (j >= 0 && pivot > temp) {
                // copy (shift) element to the right
                arr[j + 1] = pivot;
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
