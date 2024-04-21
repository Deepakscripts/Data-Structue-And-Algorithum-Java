import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        /* INITIALIZE WITH SORTED ARRAY*/
        ArrayList<Integer> pairs = new ArrayList<>();
        int target = 5;
        for (int i = 1; i <= 6; i++) {
            pairs.add(i);
        }
        System.out.println(pairs);
        /* PAIR FORMATION */
        for (int j = 0; j < pairs.size(); j++) {
            for (int k = j + 1; k < pairs.size(); k++) {
                int sumOfPair = j + k;
                if (sumOfPair == target) {
                    System.out.print("( " + j + "," + k + " )");
                }
               
            }
        }

    }
}
