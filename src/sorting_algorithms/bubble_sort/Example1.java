package sorting_algorithms.bubble_sort;

import timer.StopWatch;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        // 30.072 seconds * 10 * O(n) for 1 million elements
        Random generator = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100_000);
        }
        StopWatch watch = new StopWatch();
        System.out.println("Before sorting: ");
        //printArray(array);
        watch.start();

        if (isSorted(array)) {
            System.out.println("The array is already sorted! ");
        } else {
            boolean isSwap = true;

            while (isSwap) {
                isSwap = false;

                for (int i = 0; i < array.length - 1; i++) {

                    if (array[i] > array[i + 1]) {
                        //int temp = array[i];
                        //array[i] = array[i + 1];
                        //array[i + 1] = temp;
                        swapValues(array, i, i + 1);
                        isSwap = true;
                    }
                }
            }
            System.out.println("After sorting: ");
            //printArray(array);
            watch.stop();
            watch.printElapsedTime();
        }
    }

    public static void printArray(int[] arr) {

        for (var item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void swapValues(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static boolean isSorted(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
