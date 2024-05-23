public class Diameter {

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

    /* CALCULATE HEIGHT OF TREE */
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    /* CALCULATE DIAMETER */
    public static int calDiameter(Node root) {
        if (root == null) {
            return 0;
        }
        /* LEFT DIAMETER */
        int ld = calDiameter(root.left);
        /* LEFT HEIGHT */
        int lh = height(root.left);
        /* RIGHT DIAMETER */
        int rd = calDiameter(root.right);
        /* RIGHT HEIGHT */
        int rh = height(root.right);

        /* SELF DIAMETER */
        int selfDiameter = lh + rh + 1;
        int maxD = Math.max(Math.max(ld, rd), selfDiameter);
        return maxD;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println("Diameter of tree is " + calDiameter(root));
    }
}
