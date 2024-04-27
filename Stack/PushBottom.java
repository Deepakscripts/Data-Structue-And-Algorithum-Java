import java.util.*;

public class PushBottom {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            //last mai 4 push hoga fir return
            s.push(data);
            return;
        }
        int top = s.pop();
        //recursion
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
