import java.util.*;

public class arrar {

    public static void main(String[] args) {
        /* {TYPE A} DECLARING SIZE AND THEN TAKING INPUT */
        int marks[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Your Number: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Your Number: ");
        marks[2] = sc.nextInt();
        System.out.print("Enter Your Number: ");
        marks[3] = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {

            System.out.print(marks[i] + " ");
        }
        System.out.println();

        /* {TYPE B} DIRECLY STORE VALUES WITHOUT DECLARING SIZE */
        int numbers[] = { 1, 2, 3 };
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        String fruits[] = { "apple", "mango", "orange", "grapes" };
        for (int i = 0; i < fruits.length; i++) {

            System.out.print(fruits[i] + " ");
        }

        sc.close();
    }
}
