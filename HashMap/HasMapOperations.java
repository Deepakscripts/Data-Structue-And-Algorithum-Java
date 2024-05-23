import java.util.*;

public class HasMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("India", 1);
        hs.put("Pak", 2);
        hs.put("china", 3);
        hs.put("Nepal", 4);
        hs.put("Bhutan", 5);

        Set<String> keys = hs.keySet();
        for (String k : keys) {
            System.out.println("key=" + k + ", value= " + hs.get(k));
        }
    }
}