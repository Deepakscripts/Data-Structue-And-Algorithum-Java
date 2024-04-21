public class Tileprb {

    public static int tilingProblem(int n) {
        /* BASE CASE */
        if (n == 0 || n == 1) {
            return 1;
        }
        /* CHOICE */
        /* (a) -: VERTICAL */
        int verticalTiles = tilingProblem(n - 1);
        /* (b) -:HORIZONTAL */
        int horizontalTiles = tilingProblem(n - 2);
        /* TOTAL No OF WAYS */
        int totalWays = verticalTiles + horizontalTiles;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.print(tilingProblem(3));
        
    }
}
