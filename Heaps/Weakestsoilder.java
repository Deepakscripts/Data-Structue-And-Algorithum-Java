import java.util.*;

public class Weakestsoilder {

    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row R2) {
            if (this.soldiers == R2.soldiers) {
                return this.idx - R2.idx;
            } else {
                return this.soldiers - R2.soldiers;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };

        int k = 2; // no of rows which are weakest jo hum ko print karvani hai

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int soldiers = 0;
            for (int j = 0; j < arr.length; j++) {
                soldiers += arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(soldiers, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().idx);
        }
    }
}
