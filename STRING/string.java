/* MY APPROACH */

import java.util.*;

public class string {

    public static boolean checkifPallindrome(String name) {
        String checker = name;

        for (int i = 0; i < name.length(); i++) {

            for (int j = checker.length() - 1; j > 0; j++) {

                if (name.charAt(i) == checker.charAt(j)) {
                    System.out.print("Yes it is palindrome");
                    return true;
                }
                
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only pallindrome name");
        String name = sc.next();
        Boolean result = checkifPallindrome(name);
        System.out.println();
        System.out.println(result);
        sc.close();
    }
}