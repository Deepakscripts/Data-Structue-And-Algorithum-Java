import java.util.*;

public class DuplicateParentheses {
    public static boolean hasDuplicate(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing ke liye check
            if (ch == ')') {
                int count = 0;
                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                if (count < 1) {
                    return true;// duplicate
                } else {
                    stack.pop();// ( ko dhud liya tha tu delete bhi karna pdega.
                }
            } else {
                // dubara agge ke string ke liye
                stack.push(ch);
            }

        }
        return false;

    }

    public static void main(String[] args) {
        String str = "((a+b) + (c+d))";

        if (hasDuplicate(str)) {
            System.out.println("String contains duplicate parentheses.");
        } else {
            System.out.println("String does not contain duplicate parentheses.");
        }
    }
}
/* CONDITION YE HAI KI VALID HONI CHIYE PARRENTHESIS KO AGAR OPENING HAI TU CLOSING BHI HOGA */
