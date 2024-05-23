import java.util.*;

public class ObjectsinPQ {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(int rank, String name) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student(4, "A"));
        pq.add(new Student(3, "B"));
        pq.add(new Student(2, "C"));
        pq.add(new Student(1, "D"));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }
    }
}
