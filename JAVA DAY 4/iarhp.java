/* INVERTED ABD ROTATED AND HALF PYRAMID */

public class iarhp {

    public static void iarh(int Rows) {
        /* LINE */
        for (int i = 1; i <= Rows; i++) {
            /* SPACES */
            for (int j = 1; j <= Rows-i; j++) {
                System.out.print(" ");
            }
            /* STARS */
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        iarh(10);
    }
}
