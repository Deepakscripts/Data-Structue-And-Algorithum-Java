public class SubsetsBacktrack {

    public static void printSubsets(String str, String ans, int i) {
        /* BASE CASE */
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans + " ");
            }
            return;

        }
        /* KAAM */
        /* YES CHOICE */
        printSubsets(str, ans + str.charAt(i), i + 1);
        /* NO CHOICE */
        printSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0);

    }
}
