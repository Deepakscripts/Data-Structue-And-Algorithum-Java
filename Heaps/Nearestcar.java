import java.util.*;

public class Nearestcar {

    static class Points implements Comparable<Points> {
        int x;
        int y;
        int distanceSqr;
        int idx;

        public Points(int x, int y, int distanceSqr, int idx) {
            this.x = x;
            this.y = y;
            this.distanceSqr = distanceSqr;
            this.idx = idx;

        }

        @Override
        public int compareTo(Points p2) {
            // ascending order
            return this.distanceSqr - p2.distanceSqr;
        }
    }

    public static void main(String[] args) {
        int pts[][] = {
                { 3, 3 },
                { 5, -1 },
                { -2, 4 } };

        int k = 2;// no of nearest cars

        PriorityQueue<Points> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            // calculated distance sqr X^2 + Y^2
            int distanceSqr = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Points(pts[i][0], pts[i][1], distanceSqr, i));

        }

        // removing from pq
        for (int j = 0; j < k; j++) {
            System.out.print("C" + pq.remove().idx + " ");
        }
    }
}
