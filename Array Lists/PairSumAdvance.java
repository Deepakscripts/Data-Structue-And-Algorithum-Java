import java.util.*;

public class PairSumAdvance {
    public static boolean calculate(ArrayList<Integer> list) {
        int bp = findBreakingPoint(list);
        int target = 16;
        int n = list.size();
        int left = bp; // smallest
        int right = (bp - 1 + n) % n; // largest
        while (left != right) {
            int currTarget = list.get(left) + list.get(right);
            // case1
            if (currTarget == target) {
                return true;
            }
            // case2
            else if (currTarget < target) {
                left = (left + 1) % n;
            }
            // case3
            else {
                right = (n + right - 1) % n;
            }
        }
        return false;
    }

    // Function to find the breaking point in the rotated sorted array bz is smallest
    private static int findBreakingPoint(ArrayList<Integer> list) {
        int low = 0;
        int high = list.size() - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) > list.get(high)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(calculate(list));
    }
}
