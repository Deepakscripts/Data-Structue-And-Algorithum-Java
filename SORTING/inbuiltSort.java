import java.util.*;

public class inbuiltSort {
    public static void main(String[] args) {

        Integer arr[] = { 4, 1, 3, 4, 7, 8, 1 };
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
