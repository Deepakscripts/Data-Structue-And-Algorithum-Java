import java.util.*;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        
        // Swap the first and last elements
       
            int temp = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.set(list.size() - 1, temp);
        
        
        // Print the updated list
        System.out.println(list);
    }
}
