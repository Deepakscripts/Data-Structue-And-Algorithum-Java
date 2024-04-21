import java.util.*;

public class decimal {
    
    public static int decToBin(int n) {
        int binNum = 0;
        int p = 0;
        
        // Loop until the decimal number is greater than 0
        while (n > 0) {
            int r = n % 2; // Get the remainder when dividing by 2
            binNum += r * (int) Math.pow(10, p); // Multiply the remainder by the appropriate power of 10 and add to the binary number
            n /= 2; // Update n by dividing by 2
            p++; // Increment the power
        }
        return binNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Decimal: ");
        int n = sc.nextInt();
        int binNum = decToBin(n);
        System.out.println("Your Binary no. is: " + binNum);
        sc.close();
    }
}
