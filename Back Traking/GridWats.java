public class GridWats {

    public static int gridWays(int i, int j, int n, int m) {
        /* BASE CASE */
        /* CONDITION FOR LAST CELL */
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        /* BOUNDRY CONDITION IF ROW OR COL CROSSES */
        else if (i == n || j == n) {
            return 0;
        }
        /* KAAM */
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3;// row
        int m = 3;// col
        System.out.println(gridWays(0, 0, n, m));
    }
}
