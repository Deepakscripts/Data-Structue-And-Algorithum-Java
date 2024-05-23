import java.util.*;

public class PQinJCF {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 1; i <= 10; i++) {
            pq.add(2 * i);
        }

        System.out.println(pq.size());

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}
