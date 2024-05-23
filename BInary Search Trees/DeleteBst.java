public class DeleteBst {

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

    public static Node buildtree(int values, Node root) {
        if (root == null) {
            return new Node(values);
        }

        if (values < root.data) {
            root.left = buildtree(values, root.left);
        } else {
            root.right = buildtree(values, root.right);
        }

        return root;
    }

    public static void inOrderTreversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTreversal(root.left);
        System.out.print(root.data + " ");
        inOrderTreversal(root.right);

    }

    public static Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    /* DELETE */
    public static Node delete(Node root, int value) {
        if (value > root.data) {
            root.right = delete(root.right, value);
        }

        else if (value < root.data) {
            root.left = delete(root.left, value);
        }

        else {
            // case1- Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 - Single Child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case3 - Both Child
            Node IS = findinordersuccessor(root.right);
            // replace root with IS
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findinordersuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6, 1, 4, 10, 11, 14 };
       /*  int key = 12; */
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildtree(values[i], root);
        }

        inOrderTreversal(root);

        root = delete(root, 10);
        System.out.println();

        inOrderTreversal(root);
        /*
         * Node result = search(root, key);
         * if (result != null) {
         * System.out.println("Key found " + result.data);
         * } else {
         * 
         * System.out.println("Key not Found");
         * }
         */

    }
}
