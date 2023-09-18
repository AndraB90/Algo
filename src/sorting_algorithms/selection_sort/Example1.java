package sorting_algorithms.selection_sort;

import timer.StopWatch;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        // 2.842 * 10 * O(n) seconds for 1 million elements
        Random generator = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100_000);
        }

        StopWatch watch = new StopWatch();
        System.out.println("Before sorting: ");
        //printArray(array);
        watch.start();
        selectionSort(array);
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

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static boolean isSorted(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void selectionSort(int[] array) {

        if (isSorted(array)) {
            return;
        }

        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int indexOfMin = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    indexOfMin = j;
                }
            }
            swap(array, i, indexOfMin);
        }
    }
}
