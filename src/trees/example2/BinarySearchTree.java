package trees.example2;

public class BinarySearchTree {

    private Node createNode(int value) {
        Node node = new Node(value);
        node.left = null;
        node.right = null;
        return node;
    }

    public Node addNode(Node root, int value) {

        if (root == null) {
            return createNode(value);
        }

        if (value < root.value) {
            root.left = addNode(root.left, value);
        } else if (value > root.value) {
            root.right = addNode(root.right, value);
        }
        return root;
    }

    public void printTreeInPreOrder(Node root) {
        // PreOrder: value, left, right
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");

        printTreeInPreOrder(root.left);
        printTreeInPreOrder(root.right);
    }

    public void printTreeInOrder(Node root) {
        // InOrder: left, value, right : print sorted Tree
        if (root == null) {
            return;
        }
        printTreeInOrder(root.left);
        System.out.print(root.value + " ");
        printTreeInOrder(root.right);
    }

    public Node searchValue(Node root, int value) {

        if (root == null || root.value == value) {
            return root;
        }

        if (value < root.value) {
            return searchValue(root.left, value);
        } else {
            return searchValue(root.right, value);
        }
    }
}
