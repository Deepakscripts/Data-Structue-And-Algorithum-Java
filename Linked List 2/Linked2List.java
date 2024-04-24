public class Linked2List {
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

  /* AFTER TAIL ADD New Node */
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
    // step3 making newNode our new tail
    tail = newNode;
  }

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

  /* LOOP CYCLE IN LL */
  // solution using Floyd's Cycle finding Algorithum.
  public static boolean isCycle() {
    Node slow = head;
    Node fast = head;

    while (fast != null /* ODD CASES */ && fast.next != null/* EVEN CASES */) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;// cycle exists
      }

    }
    return false;// cycle dosent exists
  }

  /* REMOVE CYCLE */
  public static void removeCycle() {
    // dectect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        cycle = true;
        break;
      }
    }

    if (cycle == false) {
      return;
    }

    // fing meeting point
    slow = head;
    Node previous = null;
    while (slow != fast) {
      previous = fast;
      slow = slow.next;
      fast = fast.next;
    }

    // last node ko null karna hai
    previous.next = null;
  }

  /* MERGE SORT CODE */
  /* GET MID NODE FNX */
  private Node getMid(Node head) {
    Node slow = head;
    /* kuki ham ko left half ka lst node chiye in veen cases */
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; // slow will be my mid node left half ka last node hoga
  }

  /* MERGE FNX */
  private Node merge(Node head1, Node head2) {
    // dummy node
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
    // bz of dummy node
    return mergedll.next;
  }

  /* ZIG-ZAG QUESTION */
  public void zigZag() {
    // Step -1find mid
    Node slow = head;
    Node fast = head.next;
    while (fast != null/* EVEN CASES */ && fast.next != null/* ODD CASES */) {
      // +1 Turtle
      slow = slow.next;
      // +2 Hare
      fast = fast.next.next;
    }
    // slow is my middle
    Node midNode = slow;
    // Step -2 reverse 2nd half
    Node current = midNode.next;
    midNode.next = null;
    Node previous = null;
    Node next;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    Node leftHead = head;
    Node rightHead = previous;
    Node nextLeft;
    Node nextRight;
    // Step - 3 ziz-zag merge
    while (leftHead != null && rightHead != null) {
      /* merging steps */
      // leftHead ka connection store kar diya nextLeft mai
      nextLeft = leftHead.next;
      // leftHead ko point karva diya rightHead ke taraf
      leftHead.next = rightHead;
      // rightHead ka connection nextRigh mai store karava diya
      nextRight = rightHead.next;
      // righytHead aab nextLeft ke tarf point kar raha hai
      rightHead.next = nextLeft;
      /* updation steps */
      // for leftHead
      leftHead = nextLeft;
      // for rightHead
      rightHead = nextRight;
    }

  }

  public Node mergeSort(Node head) {
    /*
     * jab LL khali hoti hgai tu already sorted hoti hai, aur agar uske andar 1 hi
     * element hota hai tab bhi sorted hoti hai.
     */
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

  public static void main(String[] args) {
    Linked2List ll = new Linked2List();
    ll.addAtLast(1);
    ll.addAtLast(2);
    ll.addAtLast(3);
    ll.addAtLast(4);
    ll.addAtLast(5);
    ll.addAtLast(6);
    ll.print();
    ll.zigZag();
    ll.print();
    /*
     * ll.print();
     * ll.head = ll.mergeSort(ll.head);
     * ll.print();
     */
    // cyclic LL
    /*
     * head = new Node(1);
     * Node temp = new Node(2);
     * head.next = temp;
     * head.next.next = new Node(3);
     * head.next.next.next = temp;
     * 
     * System.out.println(isCycle());
     * removeCycle();
     * System.out.println(isCycle());
     */
  }
}
