import java.util.*;

public class isprime {

    public static boolean isPrime(int num) {
        if (num == 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int range = sc.nextInt();

        System.out.println("Prime numbers within the range:");
        for (int i = 2; i <= range; i++) {
            if (isPrime(i) == false) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
