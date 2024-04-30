import java.util.Arrays;
import java.util.Comparator;

public class MaxVhain {
    public static void main(String[] args) {
        int pairs[][] = {
                { 5, 24 },
                { 39, 60 },
                { 5, 28 },
                { 27, 40 },
                { 50, 90 }
        };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        // first tu select kar lo
        int chainEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            //starting of next should always be greater than ending of previous
            if (pairs[i][0] >= chainEnd) {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum Length of chain is " + chainLength);
    }
}
