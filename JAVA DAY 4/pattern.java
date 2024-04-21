public class pattern {
    public static void main(String[] args) {

        int a = 7;
        char ch = 'a';
        for (int line = 1; line <= a; line++) {
            for (int n = 1; n <= line; n++) {
                System.out.print(ch);
                ch++;

            }

            /* FOR NEXT LINE */
            System.out.println();
        }
        
    }
}
