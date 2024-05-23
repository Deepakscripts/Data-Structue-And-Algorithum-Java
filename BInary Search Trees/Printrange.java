public class Printrange {

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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

        public static void printRange(Node root, int k1, int k2) {
            if (root == null) {
                return;
            }

            if (root.data >= k1 && root.data <= k2) {
                printRange(root.left, k1, k2);
                System.out.print(root.data + " ");
                printRange(root.right, k1, k2);
            }


            //agar root ka data chota ho gaya k1 se tu right mai jao
            //range se kam ho gaya
            else if (root.data < k1) {
                printRange(root.left, k1, k2);
                //nahi tu left mai jao
                //range se jada ho gaya
            } else {
                printRange(root.right, k1, k2);
            }

        }

        public static void main(String[] args) {
            int values[] = { 8, 5, 3, 6, 1, 4, 10, 11, 14 };

            Node root = null;
            for (int i = 0; i < values.length; i++) {
                root = buildtree(values[i], root);
            }

            printRange(root, 5, 12);

        }
    }
}