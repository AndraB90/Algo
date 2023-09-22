package trees.example2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a new tree
        BinarySearchTree BST = new BinarySearchTree();
        // Create an array of values
        int[] numbers = new int[10];
        Random generator = new Random();

        int myNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(100);
            if (i == 5) {
                myNumber = numbers[i];
            }
        }
        // Insert values from array into the tree
        Node root = null;
        for (var value : numbers) {
            root = BST.addNode(root, value);
        }
        BST.printTreeInPreOrder(root);
        System.out.println();
        BST.printTreeInOrder(root);
        System.out.println();
        System.out.println(BST.searchValue(root, myNumber).value);
        System.out.println(myNumber);
    }
}
