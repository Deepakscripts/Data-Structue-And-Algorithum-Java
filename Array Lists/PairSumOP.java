import java.util.ArrayList;

public class PairSumOP {

    public static boolean calculate(ArrayList<Integer> pairs){
        int target = 5;
        int left = 0;
        int right = pairs.size() - 1;
        while (left != right) {
            int currTarget = pairs.get(left) + pairs.get(right);
            if (currTarget == target) {
                return true;
            } else if (currTarget < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /* 2 POINTER APPROACH */
        /* SORTED ARRAY INITIALIZED WITH No. 1 to 6 */
        ArrayList<Integer> pairs = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            pairs.add(i);
        }

       boolean result =  calculate(pairs);
       System.out.println(result);
       
    }
}
