import java.util.*;

public class countSet {

    public static void countset(int n) {
        int bitMask = 1;
        int count = 0;
        while (n != 0) {
            if ((n & bitMask) != 0) {
                count++;
            }
            n = n >> 1; // Right shift n to check each bit
        }
        System.out.println("Number of set bits: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        countset(n);
        sc.close();
    }
}
