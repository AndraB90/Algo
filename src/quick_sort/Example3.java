package quick_sort;

import timer.StopWatch;

import java.util.Random;

public class Example3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100);
        }

        StopWatch watch = new StopWatch();
        System.out.println("Before sorting: ");
        printArray(array);
        watch.start();
        quickSort(array, 0, array.length - 1);
        System.out.println("After sorting: ");
        printArray(array);
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

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int partitionIndex = start;
        for (int i = start; i <= end - 1; i++) {
            if (array[i] <= pivot) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(array, partitionIndex, end);
        return partitionIndex;
    }

}
