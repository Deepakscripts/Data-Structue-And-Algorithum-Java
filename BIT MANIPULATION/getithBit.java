import java.util.*;

public class getithBit {

    public static void getithbit(int num, int i) {
        int bitMask = 1 << i;
        if ((num & bitMask) != 0) {
            System.out.println(i + "th" + " of " + num + " is " + " 1 ");
        } else {
            System.out.println(i + "th" + " of " + num + " is " + " 0 ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        System.out.print("Enter your ith Position : ");
        int i = sc.nextInt();
        getithbit(num, i);
        sc.close();
    }
}
