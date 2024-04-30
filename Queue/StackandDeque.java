import java.util.*;

public class StackandDeque {
    static class Stack {
        Deque<Integer> d = new LinkedList<>();

        // push - add
        public void push(int data) {
            d.addLast(data);
        }

        // pop - delete
        public void pop() {
            d.removeLast();
        }

        // peek - getFirst
        public int peek() {
            return d.getLast();

        }

        // isEmpty
        public boolean isEmpty() {
            if (d.isEmpty()) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }

    }
}