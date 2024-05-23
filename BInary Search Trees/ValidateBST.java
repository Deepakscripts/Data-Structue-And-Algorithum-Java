public class ValidateBST {

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

    public static Node buildtree(int[] values, Node root) {
        for (int value : values) {
            root = insert(root, value);
        }
        return root;
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static boolean validateTree(Node root, Node max, Node min) {
        if (root == null) {
            return true;
        }

        if ((min != null && root.data <= min.data) || (max != null && root.data >= max.data)) {
            return false;
        }

        return validateTree(root.left, root, min) && validateTree(root.right, max, root);
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        root = buildtree(values, root);

        boolean result = validateTree(root, null, null);
        if (!result) {
            System.out.println("Invalid BST");
        } else {
            System.out.println("Valid BST");
        }
    }
}
