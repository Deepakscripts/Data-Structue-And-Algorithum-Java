import java.util.*;

public class pallindrome {
    public static boolean checkifPallindrome(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only pallindrome name");
        String name = sc.next();
        Boolean result = checkifPallindrome(name);
        System.out.println(result);
        sc.close();
    }
}
