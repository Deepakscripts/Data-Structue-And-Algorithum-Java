import java.util.*;

public class Printpath {

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

        public static void print(ArrayList<Integer> path) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + "-> ");
            }
            System.out.println();
        }

        public static void printPath(Node root,
                ArrayList<Integer> path) {

            if (root == null) {
                return;
            }

            // step1
            path.add(root.data);

            if (root.left == null && root.right == null) {
                print(path);
            }

            // step2
            printPath(root.left, path);
            // step3
            printPath(root.right, path);
            // print
            path.remove(path.size() - 1);

        }

        public static void main(String[] args) {
            int values[] = { 8, 5, 3, 6, 1, 4, 10, 11, 14 };

            Node root = null;
            for (int i = 0; i < values.length; i++) {
                root = buildtree(values[i], root);
            }

            ArrayList<Integer> path = new ArrayList<>();

            printPath(root, path);
        }

    }
}