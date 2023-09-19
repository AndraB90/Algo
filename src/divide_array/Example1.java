package divide_array;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] bigArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int middle = bigArray.length / 2;
        int[] left = new int[middle];
        int[] right = new int[bigArray.length - middle];

        for (int i = 0; i < left.length; i++) {
            left[i]=bigArray[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i]=bigArray[i+middle];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }
}
