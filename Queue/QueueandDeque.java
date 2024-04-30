import java.util.*;

public class QueueandDeque {
    static class Queue {
        Deque<Integer> d = new LinkedList<>();

        // add
        public void add(int data) {
            d.addLast(data);
        }

        // remove
        public void remove() {
            d.removeFirst();
        }

        // peek
        public int peek() {
            return d.getFirst();
        }

        // isEmpty
        public boolean isEmpty() {
            return d.isEmpty();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
            
        }

    }
}
