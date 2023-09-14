package sorting_algorithms.bubble_sort;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random generator = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(10001);
        }
        System.out.println("Before sorting: ");
        printArray(array);

        if (isSorted(array)) {
            System.out.println("The array is already sorted! ");
        } else {
            boolean isSorted;

            for (int i = 0; i < array.length; i++) {

                isSorted = true;
                for (int j = 1; j < array.length - i; j++) {
                    if (array[j] < array[j - 1]) {
                        swapValues(array, j, j - 1);
                        isSorted = false;
                    }
                }
                if (isSorted) {
                    break;
                }
            }

            System.out.println("After sorting: ");
            printArray(array);
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
