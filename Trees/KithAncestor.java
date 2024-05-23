public class KithAncestor {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int KAncestor(Node root, int n, int k) {

        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int LeftDistance = KAncestor(root.left, n, k);
        int RightDistance = KAncestor(root.right, n, k);

        if (LeftDistance == -1 && RightDistance == -1) {
            return -1;
        }

        int maximum = Math.max(LeftDistance, RightDistance);
        if (maximum + 1 == k) {
            System.out.println(root.data);
        }

       /*  ye hai jo value ko 1 bada ke upar le jayega */
        return maximum + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n = 5;
        int k = 2;
        KAncestor(root, n, k);
        
    }
}
