package search_algorithms.linear_search;

public class LinearSearch {
    public static int findNumber(int[] arr, int numberToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToFind) {
                System.out.println("Computer found number using " + (i + 1) + " trials");
                return i;
            }
        }
        return -1;
    }
}
