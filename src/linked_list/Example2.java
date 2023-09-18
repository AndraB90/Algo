package linked_list;

import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> lettersStack = new LinkedList<>();
        lettersStack.push("A");
        lettersStack.push("B");
        lettersStack.push("C");
        lettersStack.push("D");
        lettersStack.push("F");
        //letters1.pop();
        System.out.println(lettersStack.peek());
        System.out.println(lettersStack.peekFirst());
        System.out.println(lettersStack.peekLast());

        System.out.println(lettersStack);

        LinkedList<String> lettersQueue = new LinkedList<>();
        lettersQueue.offer("A");
        lettersQueue.offer("B");
        lettersQueue.offer("C");
        lettersQueue.offer("D");
        lettersQueue.offer("F");
        //lettersQueue.poll();
        lettersQueue.add(4,"E");
        lettersQueue.addFirst("0");
        lettersQueue.addLast("1");
        lettersQueue.removeFirst();
        lettersQueue.removeLast();


        System.out.println(lettersQueue);
    }
}
