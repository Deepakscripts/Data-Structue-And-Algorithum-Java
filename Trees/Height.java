public class Height {
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

    /* COUNT NUMBER OF NODES IN A TREE */
    public static int countNodes(Node root) {
        if ((root == null)) {
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        int treeCount = leftCount + rightCount + 1;
        return treeCount;
    }

    /* CALCULATE SUM OF EACH NODE */
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        int finalSum = leftSum + rightSum + root.data;
        return finalSum;
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * /\ /\
         * 4 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(height(root));
        System.out.println(countNodes(root));
        System.out.println(sumOfNodes(root));
    }
}
