import java.util.*;

public class IndianCoinprb {
    public static void main(String[] args) {
        Integer denomination[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000, 2000 };
        int value = 40;
        int count = 0;
        ArrayList<Integer> coins = new ArrayList<>();

        // Sort the denomination array in descending order
        Arrays.sort(denomination, Comparator.reverseOrder());

        for (int i = 0; i < denomination.length; i++) {
            if (denomination[i] <= value) {
                while (denomination[i] <= value) {
                    count++;
                    coins.add(denomination[i]);
                    value -= denomination[i];
                }
            }

        }
        System.out.println("Total denominations used are " + count);
        for (int i = 0; i < coins.size(); i++) {
            System.out.println("Denominations used are " + coins.get(i));
        }
    }
}
