import java.util.*;

public class DuplicateParentheses {
    public static boolean hasDuplicate(String str) {
        Stack<Character> stack = new Stack<>();
        int openCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if (ch == '(') {
                stack.push(ch);
                openCount++;
            }
            // closing
            else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    // Closing parenthesis without matching opening parenthesis
                    return true;
                }
                stack.pop();
                openCount--;
            }
        }
        
        // If there are any opening parentheses left without a matching closing one, it indicates duplicates
        return openCount > 0;
    }

    public static void main(String[] args) {
        String str = "((a+b)) + (c+d))";
        
        if (hasDuplicate(str)) {
            System.out.println("String contains duplicate parentheses.");
        } else {
            System.out.println("String does not contain duplicate parentheses.");
        }
    }
}
