import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        /* int weight[] = { 30, 20, 10 }; */
        int W = 50;

        // sorting if applicable
        double ratio[][] = new double[value.length][2];
        // 0th col pai -> index ; 1st col pai -> ratio

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];

        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));// ascending order mai sort hoga

        int capacity = W;
        int finalvalue = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            // for full item
            if (capacity >= weight[idx]) {
                finalvalue += value[idx];
                capacity -= weight[idx];
            }
            // fractional item dalna padega
            else {
                finalvalue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }

        }
        System.out.println("Final value = " + finalvalue);
    }
}
