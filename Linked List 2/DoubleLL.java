public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }

    }

    public static Node head;
    public static Node tail;
    public int size;

    /* PRINT LL O(n) */
    public void print() {
        /* IF HEAD IS NULL */
        if (head == null) {
            System.out.println("LL Is empty");
        }
        /* STEP 1 temp pointing towards head */
        Node temp = head;
        /* STEP 2 print data if temp is not null */
        while (temp != null) {
            System.out.print(temp.data + " ");
            /*
             * STEP 3 Point temop to next node bz we are initializing temp node again with
             * refrence of next node which was stored in Head
             */
            temp = temp.next;
        }
        System.out.println();
    }

    /* ADD */
    // add before head - addFirst
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
        // head ko newNode ke taraf point karav denge
        head.previous = newNode; // linking

        // step 3 newNode becomes head
        head = newNode;

    }

    // add at last after tail
    public void addAtLast(int data) {
        // step 1 creation
        Node newNode = new Node(data);
        size++;
        /* IF LL IS EMPTY */
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 tail point towards new tail
        tail.next = newNode;
        // newode ko vapis tail ke taraf point karav diya
        newNode.previous = tail;
        // step3 making newNode our new tail
        tail = newNode;
    }

    /* REMOVE */
    // remove from first - before head
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        // naya head ban gaya
        head = head.next;
        // head ka previous null ho gaya tu uske phele ka garbage collector delete kar
        // dega
        head.previous = null;
        size--;
        return value;// new head
    }

    // remove fro last - after tail
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = tail.data;
        // Step 1: Get the node before tail
        Node prev = tail.previous;
        // Step 2: Update tail to the previous node
        tail = prev;
        // Step 3: Update the next reference of the new tail to null
        tail.next = null;
        // Step 4: Decrease size
        size--;
        return value;// new tail
    }

    /* REVERSE LL */
    public void reverse() {
        // head ke phele vali node null hoti hai
        Node prev = null;
        // kuki reverse kar rahe hai tu tail hai hamri head ban jayegi
        Node current = tail = head;

        Node next;

        while (current != null) {
            /* NEXT CREATION */
            next = current.next;
            /* Current PREVIOUS ko point karega */
            current.next = prev;
            // current ka previous next ke tarf (piche ke taraf point karne lag jayega)
            current.previous = next;
            /* CURRENT KO PREVIOUS BANA DO */
            prev = current;
            /* NEXT KO CURRENT BANA DO */
            current = next;
        }
        head = prev;

    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addAtFirst(3);
        dll.addAtFirst(2);
        dll.addAtFirst(1);
        dll.addAtLast(4);
        dll.addAtLast(5);
        dll.addAtLast(6);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
        dll.removeLast();
        dll.print();
        System.out.println(dll.size);
        dll.reverse();
        dll.print();
    }
}
