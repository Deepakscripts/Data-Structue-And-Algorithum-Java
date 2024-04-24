import java.util.*;

public class InbuiltLinkedList {
    /* CLASS FOR CREATING OBJECTS */
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // variable initialization with data type of our class name
    public static Node head;
    public static Node tail;
    public static int size;

    /* GET MID NODE FNX */
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow will be my mid node
    }

    /* MERGE FNX */
    private Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left and right half ke merge sort ko call
        Node rightHead = mid.next;
        mid.next = null;
        // left hafl
        Node newLeft = mergeSort(head);
        // right half
        Node newRight = mergeSort(rightHead);
        // merge
        return merge(newLeft, newRight);
    }

    /* ADD BEFORE HEAD */
    public void addAtFirst(int data) {
        // step1 Create new Node
        Node newNode = new Node(data);
        size++;
        /* IF LL IS EMPTY */
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 newNode will point Toward old head bz this is infront of head
        newNode.next = head; // linking

        // step 3 newNode becomes head
        head = newNode;

    }

    public static void main(String[] args) {
        // creation
        LinkedList<Integer> ll = new LinkedList<>();
       ll.addAtFirst();
        System.out.println(ll);
        ll.head = mergeSort(ll.head);
    }

}
