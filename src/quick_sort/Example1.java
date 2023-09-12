package quick_sort;

import timer.StopWatch;

import java.util.Random;

public class Example1 {
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

    public static void swapValues(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int pivotIndex = createPartition(arr, begin, end);
            quickSort(arr, begin, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static int createPartition(int[] arr, int beginIndex, int endIndex) {
        int pivot = arr[beginIndex];
        int leftIndex = beginIndex + 1;
        int rightIndex = endIndex;
        while (true) {
            while (leftIndex <= rightIndex && arr[leftIndex] <= pivot) {
                leftIndex++;
            }
            while (leftIndex <= rightIndex && arr[rightIndex] >= pivot) {
                rightIndex--;
            }
            if (leftIndex > rightIndex) {
                break;
            }

            swapValues(arr, leftIndex, rightIndex);
        }
        swapValues(arr, beginIndex, rightIndex);
        return rightIndex;

    }


}
