import java.util.*;

public class QueueReversal {

    public static void queueReversalFnx(Queue<Integer> q1) {
        // Create a stack to store reversed elements temporarily
        Stack<Integer> stack = new Stack<>();

        // Reversing the elements of q1 and storing them in the stack
        while (!q1.isEmpty()) {
            stack.push(q1.remove());
        }

        // Printing the reversed elements from the stack
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        queueReversalFnx(q1);
    }
}
