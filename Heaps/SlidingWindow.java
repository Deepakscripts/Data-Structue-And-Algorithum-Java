import java.util.*;

public class SlidingWindow {

    static class Pair implements Comparable<Pair> {
        int value;
        int idx;

        public Pair(int value, int idx) {

            this.value = value;
            this.idx = idx;

        }

        @Override
        public int compareTo(Pair P2) {
            // descending
            return P2.value - this.value;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, 3, 5, 3, 6, 7 };
        int k = 3;
        // size of result array k aformula hai
        int res[] = new int[arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st -window
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().value;

        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i - k + 1] = pq.peek().value;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
