package trees.example1;

public class Example1 {
    public static void main(String[] args) {
        // Level 1
        Node root = createNode(1);

        // Level 2
        root.leftChild = createNode(2);
        root.rightChild = createNode(3);

        // Level 3
        root.leftChild.leftChild = createNode(4);
        root.leftChild.rightChild = createNode(5);
        root.rightChild.leftChild = createNode(6);
        root.rightChild.rightChild = createNode(7);

        // Level 4
        root.leftChild.rightChild.leftChild = createNode(9);
        root.rightChild.rightChild.leftChild = createNode(15);

        printTreeInPreOrder(root);
        System.out.println();
        printTreeInOrder(root);
        System.out.println();
        printTreePostOrder(root);
    }

    private static Node createNode(int value) {
        // Step 1: Create a new Node
        // Step 2: Set the value to the node;
        Node node = new Node(value);

        // Step 3: Set the left and right children which initially will be null
        node.leftChild = null;
        node.rightChild = null;

        // Step 4: Return the Node
        return node;
    }

    private static void printTreeInPreOrder(Node root) {
        // PreOrder: value, left, right
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");

        printTreeInPreOrder(root.leftChild);
        printTreeInPreOrder(root.rightChild);
    }

    private static void printTreeInOrder(Node root) {
        // InOrder: left, value, right
        if (root == null) {
            return;
        }
        printTreeInOrder(root.leftChild);
        System.out.print(root.value + " ");
        printTreeInOrder(root.rightChild);
    }

    private static void printTreePostOrder(Node root) {
        // PostOrder: left, right, value
        if (root == null) {
            return;
        }
        printTreePostOrder(root.leftChild);
        printTreePostOrder(root.rightChild);
        System.out.print(root.value + " ");
    }
}
