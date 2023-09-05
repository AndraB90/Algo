package bubble_sort;

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

        boolean isSorted;

        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = 1; j < array.length-i; j++) {
                if(array[j]<array[j-1]){
                    swapValues(array, j,j-1);
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
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
