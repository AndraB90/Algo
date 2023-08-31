package binary_search;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        System.out.println("Input a number between 1 and 100: ");
        int[] computerArr = new int[100];
        for (int i = 1; i <= 100; i++) {
            computerArr[i-1]=i;
        }
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int secretNumber = r.nextInt(1, 101);
        int playerGuess;
        int computerGuess;
        int count = 0;

        while (true) {
            playerGuess = scan.nextInt();
            count++;
            if (playerGuess < secretNumber) {
                System.out.println("More");
            } else if (playerGuess > secretNumber) {
                System.out.println("less");
            } else {
                System.out.println("You win");
                System.out.println("You used " + count + " trials");
                break;
            }
        }

        BinarySearch.findNumber(computerArr, secretNumber);

    }
}
