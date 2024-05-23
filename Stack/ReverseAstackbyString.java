
/* REVERSE A STRING USING A STACK */
import java.util.*;

public class ReverseAstack {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "abc";
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.empty()) {
            char current = s.pop();
            result.append(current);
        }
        str = result.toString();
        System.out.println(str);
    }
}
