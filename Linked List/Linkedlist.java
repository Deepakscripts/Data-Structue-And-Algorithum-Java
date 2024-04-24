public class Linkedlist {

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

  /* ADD IN Between OF LL O(n) */
  public void addInBetween(int index, int data) {
    if (index == 0) {
      addAtFirst(data);
      return;
    }
    /* CREATION OF NEW NODE */
    Node newNode = new Node(data);
    size++;
    /* creation of temp point towards head */
    Node temp = head;
    int trackIdx = 0;
    // previous ko find kiya
    while (trackIdx < index - 1) {
      temp = temp.next;
      trackIdx++;
    }

    // trackIndex = index -1; temp ->-> previous
    // newNode pointing towards next
    newNode.next = temp.next;
    // previous pointing towards newNode
    temp.next = newNode;

  }

  /* REMOVE FROM FIRST i.e, before head */
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
    head = head.next;
    size--;
    return value;// new head
  }

  /* REMOVE FROM LAST AFTER TAIL */
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
    // previous size-1
    Node previous = head;
    for (int i = 0; i < size - 2; i++) {
      previous = previous.next;
    }
    int value = previous.next.data;
    previous.next = null;
    tail = previous;
    size--;
    return value;// new tail
  }

  /* LINEAR SEARCH O(n) */
  public int itrSearch(int key) {
    // initialize
    Node temp = head;
    int index = 0;
    while (temp != null) {
      if (temp.data == key) {
        return index;
      }
      temp = temp.next;
      index++;
    }
    return -1;
  }

  /* RECURSIVE SEARCH O(n) */
  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;
    }
    int idx = helper(head.next, key);// next vala head ban gaya

    if ((idx == -1)) {
      return -1;
    }
    return idx + 1;
  }

  public int recursiveSearch(int key) {
    return helper(head, key);
  }

  /* REVERSE LL */
  public void reverse() {
    // head ke phele vali node null hoti hai
    Node previous = null;
    // kuki reverse kar rahe hai tu tail hai hamri head ban jayegi
    Node current = tail = head;
    //
    Node next;

    while (current != null) {
      /* NEXT CREATION */
      next = current.next;
      /* Current PREVIOUS ko point karega */
      current.next = previous;
      /* CURRENT KO PREVIOUS BANA DO */
      previous = current;
      /* NEXT KO CURRENT BANA DO */
      current = next;
    }
    head = previous;

  }

  /* REMOVE Nth NODE FROM END O(n) iterative approach */
  // jo node ;ast se nth node hoti ho vo start se hoti hai = (Size - n + 1)
  // size - n == previous (iska next change kar ke size - n +2 ke taraf point
  // karav denge)
  public void deleteNthFromEnd(int n) {
    // calculate size
    int size = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      size++;
    }
    // head ko delete kar denge if n == size piche se hai kuki
    if (n == size) {
      // head ka aage jo bhi tha usko aab head bana diya
      head = head.next;
      return;
    }

    int i = 1;
    // position just before we want to delete
    int iToFind = size - n;
    Node previous = head;
    while (i < iToFind) {
      previous = previous.next;
      i++;
    }
    // linking size -n and size - n +2 position and jo beech mai hai vo apne aap
    // Garbage collector delete kar dega
    previous.next = previous.next.next;
    return;
  }

  /* FINDING MIDDLE OF A LL */
  // slow fast approach
  public Node findMiddle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null/* EVEN CASES */ && fast.next != null/* ODD CASES */) {
      // +1 Turtle
      slow = slow.next;
      // +2 Hare
      fast = fast.next.next;
    }
    // slow is my middle
    return slow;
  }

  /* CHECK PALLINDROME */
  public boolean checkPallindrome() {
    // base case
    if (head == null || head.next == null) {
      return true;
    }
    // step 1 Find mid
    Node midNode = findMiddle(head);
    // step 2 reverse 2nd half
    Node previous = null;
    Node current = midNode;
    Node next;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    Node right = previous;// 2nd half ka head kuki current null ho gaya and previous last mai aa gaya
    Node left = head;
    // step 3 check left and right half
    while ((right != null)) {
      if (left.data != right.data) {
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }

  public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    ll.addAtFirst(1);
    ll.addAtFirst(2);
    ll.addAtFirst(2);
    ll.addAtFirst(1);
    
    ll.print();
    /* ll.addInBetween(2, 100); */
    /* ll.deleteNthFromEnd(2); */
    System.out.println(ll.checkPallindrome());

    /*
     * System.out.println(ll.size);
     * ll.removeFirst();
     * ll.print();
     * System.out.println(ll.removeFirst());
     * ll.removeLast();
     * ll.print();
     * System.out.println(ll.removeLast());
     */
    /* System.out.println(ll.itrSearch(11)); */
    /*
     * System.out.println(ll.recursiveSearch(11));
     * System.out.println(ll.recursiveSearch(19));
     */

    /* ll.reverse(); */
    /* ll.print(); */
  }
}