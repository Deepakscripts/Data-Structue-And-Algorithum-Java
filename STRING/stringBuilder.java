public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sh = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sh.append(ch);
            
        }
        System.out.println(sh + " ");
        System.out.println(sh.length());
    }
}
