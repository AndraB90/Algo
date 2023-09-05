package bubble_sort;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(1001);
        }
        System.out.println("Before sorting: ");
        printArray(array);

        boolean isSwap = true;

        while (isSwap) {
            isSwap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    //int temp = array[i];
                    //array[i] = array[i + 1];
                    //array[i + 1] = temp;
                    swapValues(array,i, i+1);
                    isSwap = true;
                }
            }
        }


        System.out.println("After sorting: ");
        printArray(array);
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
}
