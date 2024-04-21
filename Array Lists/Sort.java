import java.util.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 5; i > 0; i--) {
            list.add(i);
        }
        

        /* ASCENDING ORDER */
        Collections.sort(list); // Sort the list
        System.out.print(list); // Print the sorted list
        System.out.println();
         
        /* DESCENDING ORDER */
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list); // Print the sorted list

    }
}
