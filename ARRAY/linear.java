import java.util.*;

public class linear {

    public static int searchMyN(int array[], int N) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == N) {
                return i;
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N You WAnt to find : ");
        int N = sc.nextInt();

      int result =   searchMyN(array, N);
        if (result == -1) {
            System.out.print("N not found SORRY");
        }
        else{
            System.out.print("Element found at index: " + result);
        }
        sc.close();

    }
}