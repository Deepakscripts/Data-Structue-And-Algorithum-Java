import java.util.*;

public class javaLoops {

    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 2) {
            System.out.println("Prime Number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;

                }

            }

            if (isPrime == true) {
                System.out.println("Prime Number");

            } else {
                System.out.println("Not A Prime Number");
            }
        }
        sc.close();
    }
}
