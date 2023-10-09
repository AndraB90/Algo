package search_algorithms.binary_search;

import java.util.Arrays;

public class BinarySearch {

    public static int findNumber(int[] arr, int numberToFind) {
        Arrays.sort(arr);
        int minPosition = 0;
        int maxPosition = arr.length - 1;
        int count = 0;

        while (minPosition <= maxPosition) {
            int middlePosition = (maxPosition + minPosition) / 2;
            int middleNumber = arr[middlePosition];
            count++;

            if (numberToFind == middleNumber) {
                System.out.println("Computer found number using " + count + " trials");
                return middlePosition;
            } else if (numberToFind > middleNumber) {
                minPosition = middlePosition + 1;
            } else {
                maxPosition = middlePosition - 1;
            }
        }
        return -1;
    }
}
