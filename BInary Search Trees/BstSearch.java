public class BstSearch {
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

    public static Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        
        // If the key is smaller than the root's data, search in the left subtree
        if (key < root.data) {
            return search(root.left, key);
        }

        // If the key is larger than the root's data, search in the right subtree
        return search(root.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(5);
        root.right.right = new Node(6);
        int key = 8;
        Node result = search(root, key);
        if (result != null) {
            System.out.println("Key found: " + result.data);
        } else {
            System.out.println("Key not found");
        }
    }
}
