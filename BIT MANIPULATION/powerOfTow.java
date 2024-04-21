import java.util.*;

public class powerOfTow {

    public static void ckeckForPowerOfTwo(int n) {

        if ((n & n - 1) == 0) {
            System.out.println(" Yes " + n + " is power of 2 ");
        } else {
            System.out.println(" No " + n + " is not power of 2 ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        ckeckForPowerOfTwo(n);
        sc.close();
    }
}
