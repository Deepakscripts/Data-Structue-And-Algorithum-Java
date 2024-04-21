import java.util.*;

public class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter Your Number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.print("To print Sum Of Your Number Press 0 otherwise 1 : " + " ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);

        sc.close();
    }
}
