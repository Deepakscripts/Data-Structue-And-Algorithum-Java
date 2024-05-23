import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("D", 3);
        hm.put("E", 4);
        hm.put("F", 5);
        hm.put("G", 5);

        Set<String> keys = hm.keySet();

        for (String key : keys) {
            System.out.println(key);
            System.out.println(hm.get(key));
        }
    }
}
