import java.util.*;

public class Max {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.print(max);

        

    }
}
