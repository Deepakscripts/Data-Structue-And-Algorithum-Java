public class hollowRec {
    public static void holloRectangle(int trows, int tcolumns) {
        /* OUTER LOOP */
        for (int i = 1; i <= trows; i++) {
            /* INNER LOOP */
            for (int j = 1; j <= tcolumns; j++) {
                /* CELL (i, j) */
                if (i == 1 || i == trows || j == 1 || j == tcolumns) {
                    /* BOUNDARY CELLS */
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        holloRectangle(4, 5);
    }
}
