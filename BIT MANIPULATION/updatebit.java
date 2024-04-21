import java.util.*;

public class updatebit {

    public static void updateBit(int n, int i, int newBit) {
        /* CLEAR */
        if (newBit == 0) {
            int bitMask = ~(1 << i);
            int newNum = n & bitMask;
            System.out.println(" New Number after clearing ith bit is " + newNum);
        } else {
            /* SET */
            int bitMask = 1 << i;
            int newNum = n | bitMask;
            System.out.println(" New Number after setting ith bit is " + newNum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter i : ");
        int i = sc.nextInt();
        System.out.print("Enter newBit : ");
        int newBit = sc.nextInt();
        updateBit(n, i, newBit);
        sc.close();
    }
}
