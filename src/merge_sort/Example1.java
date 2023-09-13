package merge_sort;

import timer.StopWatch;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100_001);
        }
        StopWatch watch = new StopWatch();
        System.out.println("Before sorting: ");
        //printArray(array);
        watch.start();
        divide(array);
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

    public static void divide(int[] array) {
        int size = array.length;
        if (size < 2) {
            return;
        }
        int middleIndex = size / 2;
        int[] leftArray = new int[middleIndex];
        int[] rightArray = new int[size - middleIndex];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[middleIndex + i];
        }
        divide(leftArray);
        divide(rightArray);
        conquer(array, leftArray, rightArray);
    }

    public static void conquer(int[] bigArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int leftIndex = 0, rightIndex = 0, bigIndex = 0;

        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                bigArray[bigIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                bigArray[bigIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            bigIndex++;
        }

        while (leftIndex < leftSize) {
            bigArray[bigIndex] = leftArray[leftIndex];
            leftIndex++;
            bigIndex++;
        }

        while (rightIndex < rightSize) {
            bigArray[bigIndex] = rightArray[rightIndex];
            rightIndex++;
            bigIndex++;
        }
    }
}

