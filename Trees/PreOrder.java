import java.util.*;

public class PreOrder {
    /* NODE */
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

    static class BinaryTree {
        public static int idx = -1;

        public static Node buildTree(int nodes[], int n) {
            idx++;
            if (idx >= n || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes, n);
            newNode.right = buildTree(nodes, n);
            return newNode;
        }

        /* PREORDER TRAVERSAL */
        public static void printPreOrder(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.data + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);

        }

        /* INORDER TRAVERSAL */
        public static void printInOrder(Node node) {
            if (node == null) {
                return;
            }
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);

        }

        /* POSTORDER TRAVERSAL */
        public static void printPostOrder(Node node) {
            if (node == null) {
                return;
            }
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " ");

        }

        /* LEVEL ORDER TRAVERSAL Using Queue (Breadth first search) */
        public static void printLevelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    Node currNode = q.poll();
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6 };
        int n = nodes.length;

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes, n);
        tree.printPreOrder(root);
        System.out.println();
        tree.printInOrder(root);
        System.out.println();
        tree.printPostOrder(root);
        System.out.println();
        tree.printLevelOrder(root);

    }
}
