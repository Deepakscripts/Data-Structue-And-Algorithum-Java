import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        System.out.println(hs);

        /* Iterator i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        } */


        for (Integer i : hs) {
            System.out.println(i);
        }
    }
}
