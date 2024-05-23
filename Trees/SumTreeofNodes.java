import java.util.LinkedList;
import java.util.Queue;

public class SumTreeofNodes {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        // purana data store kar liya
        int data = root.data;

        // root ka dat update ho gaya
        int newLeft = root.left == null ? 0 : root.left.data;

        int newRight = root.right == null ? 0 : root.right.data;

        root.data = leftChild + newLeft + rightChild + newRight;

        // purana daya return kar diya to be used by upper levels
        return data;
    }

    /* LEVEL ORDER TRAVERSAL Using Queue (Breadth first search) */
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        transform(root);
        preOrder(root);

    }
}
