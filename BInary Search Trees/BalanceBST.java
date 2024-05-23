public class BalanceBST {
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

    public static Node insert(int value, Node root) {
        if (root == null) {
            // If the root is null, create a new node and return it as the new root
            return new Node(value);
        }

        // If the value is less than the root's data, insert into the left subtree
        if (value < root.data) {
            root.left = insert(value, root.left);
        }
        // If the value is greater than the root's data, insert into the right subtree
        else if (value > root.data) {
            root.right = insert(value, root.right);
        }

        // Return the root after insertion
        return root;
    }

    public static Node creatrBST(int values[], int start, int end) {

        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(values[mid]);

        root.left = creatrBST(values, start, mid - 1);
        root.right = creatrBST(values, mid + 1, end);
        return root;

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int values[] = { 3, 5, 6, 8, 10, 11, 12 };

        int arr[] = { 3, 5, 1, 12, 8, 10, 4, 6, 2 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(arr[i], root);
        }
        inorder(root);
        int start = 0;
        int end = values.length - 1;
        Node result = creatrBST(values, start, end);
        /* preorder(result); */

    }
}