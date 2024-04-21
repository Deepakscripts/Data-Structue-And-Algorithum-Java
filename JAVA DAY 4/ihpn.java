public class ihpn {

    public static void npyramid(int num) {
        
        /* LINES */
        for (int i = 1; i <= num; i++) {

            /* NUMBERS */

            for (int j = 1; j <= i; j++) {
                System.out.print((j % 2 == 0) ? " 0 " : " 1 ");
                
                


            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        npyramid(n);
    }
}
