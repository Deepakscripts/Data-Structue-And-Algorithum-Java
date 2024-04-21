import java.util.*;

public class binary {

    public static int convertBinToDec(int n) {
        int power = 0;
        int decimal = 0;

        while (n != 0) {
            int ld = n % 10;
            decimal += ld * Math.pow(2, power);
            n /= 10;
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Binary No. ");
        int n = sc.nextInt();

        int result = convertBinToDec(n);
        System.out.println("Decimal equivalent: " + result);
        sc.close();
    }
}
