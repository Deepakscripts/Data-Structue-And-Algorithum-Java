public class Permutations {

    public static void printPermutations(String str, String ans) {
        /* BASE CASE */
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        /* KAAM */
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(Newstr, ans + current);

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}
