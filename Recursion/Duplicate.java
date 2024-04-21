public class Duplicate {

    public static void remoceDuplicates(String str, int idx, StringBuilder newString, boolean map[]) {
        /* BASE CASE */
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        /* KAAM */
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            /* DUPLICATE */
            remoceDuplicates(str, idx + 1, newString, map);
        } else {
            map[currChar - 'a'] = true;
            remoceDuplicates(str, idx + 1, newString.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnaacollege";
        remoceDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
