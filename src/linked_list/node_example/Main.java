package linked_list.node_example;

public class Main {
    public static void main(String[] args) {
        Node head = new Node("Alex");
        Node n1 = new Node("Vlad");
        Node n2 = new Node("Mary");
        Node n3 = new Node("Jerry");
        Node n4 = new Node("Tom");

        head.nextAddress = n1;
        n1.nextAddress = n2;
        n2.nextAddress = n3;
        n3.nextAddress = n4;
        n4.nextAddress = null;
    }
}
