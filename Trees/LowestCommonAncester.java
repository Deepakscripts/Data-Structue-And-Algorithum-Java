import java.util.*;

public class LowestCommonAncester {

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

    public static boolean getMyPath(Node root, int n, ArrayList<Node> path) {

        if (root == null) {
            return false;
        }

        path.add(root);
        if (root.data == n) {
            return true;
        }

        boolean leftPath = getMyPath(root.left, n, path);
        boolean rightPath = getMyPath(root.right, n, path);

        if (leftPath || rightPath) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;

    }

    public static Node lca(Node root, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getMyPath(root, n1, path1);
        getMyPath(root, n2, path2);

        // last common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // unequal value se ek phele wala
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4;
        int n2 = 5;
        System.out.println(lca(root, n1, n2).data);
    }
}
