import java.util.ArrayList;

public class BSTtoBalBst {

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

    public static Node insret(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insret(root.left, value);
        } else if (value > root.data) {
            root.right = insret(root.right, value);
        }

        return root;
    }

    public static ArrayList<Integer> inorderSeq(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        return arr;
    }

    public static void inorderTraversal(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, arr);
        System.out.print(root.data + "->");
        arr.add(root.data);
        inorderTraversal(root.right, arr);
    }

    public static Node balanceBst(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = balanceBst(arr, start, mid - 1);
        root.right = balanceBst(arr, mid + 1, end);

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

    public static void main(String[] args) {
        int values[] = { 8, 6, 9, 5, 3, 1, 2, 4, 12 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insret(root, values[i]);
        }

        ArrayList<Integer> inorderValues = inorderSeq(root);
        System.out.println();
        Node balancedRoot = balanceBst(inorderValues, 0, inorderValues.size() - 1);
        preorder(balancedRoot);
    }
}
