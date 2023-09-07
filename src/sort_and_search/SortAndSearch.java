package sort_and_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortAndSearch {
    public static void main(String[] args) {
        List<Integer> myNumbersList = new ArrayList<>(List.of(50, 31, 21, 28, 72, 41, 73, 93, 68, 43, 45, 78, 5, 17, 97, 71, 69, 61, 88, 75, 99, 44, 55, 9));
        System.out.println("Before sorting: " + myNumbersList);
        System.out.print("After sorting: ");
        sort(myNumbersList);
        int numberIndex = new Random().nextInt(myNumbersList.size());
        int numberToSearch= myNumbersList.get(numberIndex);
        System.out.println("The number to search is: "+numberToSearch);
        search(myNumbersList, numberToSearch);
    }

    public static void sort(List<Integer> numbersList) {
        boolean isSwap = true;
        while (isSwap) {
            isSwap =false;
            for (int i = 0; i < numbersList.size() - 1; i++) {
                if (numbersList.get(i).compareTo(numbersList.get(i + 1)) > 0) {
                    Integer temp = numbersList.get(i);
                    numbersList.set(i, numbersList.get(i + 1));
                    numbersList.set(i + 1, temp);
                    isSwap = true;
                }
            }
        }
        System.out.println(numbersList);
    }

    public static int search(List<Integer> numbersList, int number) {
        int startIndex = 0;
        int endIndex = numbersList.size() - 1;
        int numberOfTrials = 0;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            int middleNumber = numbersList.get(middleIndex);

            if (number == middleNumber) {
                System.out.println("Number of tries: " + numberOfTrials);
                return middleIndex; // Return the index where the number is found.
            } else if (number < middleNumber) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }

            numberOfTrials++;
        }
        return -1; // Number not found in the list.

    }
}
