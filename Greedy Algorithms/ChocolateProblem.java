
import java.util.*;

public class ChocolateProblem {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        Integer costvertical[] = { 2, 1, 3, 1, 4 };// m-1
        Integer costHorizontal[] = { 4, 1, 2 };// n-1

        // sorting
        Arrays.sort(costvertical, Collections.reverseOrder());
        Arrays.sort(costHorizontal, Collections.reverseOrder());

        // cuts tracker
        int horizontalCut = 0;
        int verticalCut = 0;

        // pieces tracker
        int horizontalPieces = 1;
        int verticalPieces = 1;
        int cost = 0;

        while (horizontalCut < costHorizontal.length && verticalCut < costvertical.length) {
            // vertical cost < horizontal cost
            // phele jiski cost jada hai usko cut lagan hai taki baad mai cost of cutting
            // kam pade
            if (costvertical[verticalCut] <= costHorizontal[horizontalCut]) {
                // horizontal cut
                cost += (costHorizontal[horizontalCut] * verticalPieces);
                horizontalPieces++;
                horizontalCut++;
            } else {
                // vertical cut
                cost += (costvertical[verticalCut] * horizontalPieces);
                verticalPieces++;
                verticalCut++;
            }
        }
        while (horizontalCut < costHorizontal.length) {
            // horizontal cut
            cost += (costHorizontal[horizontalCut] * verticalPieces);
            horizontalPieces++;
            horizontalCut++;
        }
        while (verticalCut < costvertical.length) {
            // vertical cut
            cost += (costvertical[verticalCut] * horizontalPieces);
            verticalPieces++;
            verticalCut++;
        }
        System.out.println("min cost of cuts = " + cost);
    }
}
