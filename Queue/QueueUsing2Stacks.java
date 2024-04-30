/* Queue using 2 stacks */
import java.util.*;

public class QueueUsing2Stacks {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        public static void add(int data) {
            // step 1
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // step 2
            s1.push(data);

            // step3
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove fnx
        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        // peek
        public static int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
