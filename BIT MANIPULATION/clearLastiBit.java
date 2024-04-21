import java.util.*;

public class clearLastiBit {
    public static void claerlstbits(int n, int i) {
        int bitMask = (~0) << i;
        int newNum = n & bitMask;
        System.out.println(" New Number after setting ith bit is " + newNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter i : ");
        int i = sc.nextInt();
        claerlstbits(n, i);
        sc.close();
    }
}
