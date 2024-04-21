
import java.util.Scanner;

public class javaOperators {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        int income = sc.nextInt();

        if (income < 500000) {
            System.out.println("Non Taxable Income");
        } else if (income >= 500000 && income < 1000000) {
            double net = income * 0.8;
            System.out.println(net);
        } else {
            double net = income * 0.7;
            System.out.println(net);
        }

        sc.close();
    }
}
