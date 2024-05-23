import java.util.*;

public class countDIstele {

    public static int countDistinctElement(int num[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int num[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        int result = countDistinctElement(num);

        System.out.println(result); // Expected output: 7
    }
}
