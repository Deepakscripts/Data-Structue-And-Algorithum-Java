public class BuildBst {

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

    /* INORDER TRAVERSAL GIVES SORTED BST */
    public static void inordertrv(Node root) {
        if (root == null) {
            return;
        }

        inordertrv(root.left); // Traverse left subtree
        System.out.print(root.data + " "); // Print root
        inordertrv(root.right); // Traverse right subtree
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(values[i], root); // Update the root after each insertion
            inordertrv(root); // Print inorder traversal after each insertion
            System.out.println(); // Newline for better readability
        }
    }
}
