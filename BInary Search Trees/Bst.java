/* EXAMPLE OF BINARY SEARCH TREE */
public class Bst {

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
/* INORDER TREVERSAL GIVES SORTED BST */
    public static void inordertrv(Node root) {
        if (root == null) {
            return ;
        }

        inordertrv(root.left);//left
        System.out.print(root.data + " ");//root
        inordertrv(root.right);//right
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(5);
        root.right.right = new Node(6);
        inordertrv(root);

    }
}