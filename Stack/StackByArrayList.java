import java.util.*;

public class StackByArrayList {
    static AbstractList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
        return list.size() == 0;
    }

    // push
    public static void push(int data) {
        list.add(data);
    }

    // pop to delete
    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    // peek to retrive last
    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        int peek = list.get(list.size() - 1);
        return peek;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
