public class DiameterApp2 {

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

    static class Info {
        int diameter;
        int height;

        public Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    /* CALCULATE DIAMETER */
    public static Info calDiameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        // left info
        Info leftInfo = calDiameter(root.left);
        // right info
        Info rightInfo = calDiameter(root.right);
        // diameter
        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),
                leftInfo.height + rightInfo.height + 1);
        // height
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diameter, height);

    }

    public static void main(String[] args) {//O(n)
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        int result = calDiameter(root).diameter;
        System.out.println("Diameter of tree is " + result);
    }
}
