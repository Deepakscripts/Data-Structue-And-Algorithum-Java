import java.util.*;

public class oddeven {

    public static void checkoddeven(int n) {
        int bitMask = 1;
        if ((n & 1) == bitMask) {
            System.out.println(n + " is Odd number");
        }
        else {
            System.out.println(n + " is Even number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        checkoddeven(n);
        sc.close();
    }
}
