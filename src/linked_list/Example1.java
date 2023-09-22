package linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> colorsArrayList = new ArrayList<>();
        colorsArrayList.add("red");
        colorsArrayList.add("blue");
        colorsArrayList.add("green");
        colorsArrayList.add("white");
        colorsArrayList.add("yellow");

        /**
         * ArrayList is slower for inserting / adding / removing a value, because it needs to create another array in the background
         */
        colorsArrayList.add(3, "black");

        System.out.println(colorsArrayList);

        /** ArrayList is faster for getting a value by index (O(1) constant time complexity)
         *
         */
        System.out.println(colorsArrayList.get(4));

        List<String> colorsLinkedList = new LinkedList<>();
        colorsLinkedList.add("red");
        colorsLinkedList.add("blue");
        colorsLinkedList.add("green");
        colorsLinkedList.add("white");
        colorsLinkedList.add("yellow");

        /**
         * LinkedList is faster in inserting / adding / removing elements because it just switch the address pointer of the nodes
         */
        colorsLinkedList.add(3, "black");

        System.out.println(colorsLinkedList);

        /**
         * LinkedList is slower for getting a value by index, because it needs to browse every index until the specific value
         * O(n) linear time complexity
         */
        System.out.println(colorsLinkedList.get(4));
    }
}
