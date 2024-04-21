import java.util.*;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> rollno = new ArrayList<>();

        /* O(1) */
        /* ADD ELEMENT INSIDE ARRAYLIST */
        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        rollno.add(4);
        rollno.add(5);
        rollno.add(6);

        /* ADD DIFFERENT SYNTAX O(n)*/
        rollno.add(6, 12);

        /* PRINT ARRAYLIST */
        for(int i =0; i<rollno.size(); i++){
            System.out.print(rollno.get(i) + " ");
        }

        /* GET ELEMENT O(1) */
        System.out.println(rollno.get(0));

        /* REMOVE ELEMENT O(n) */
        rollno.remove(2);
        System.out.println(rollno);

        /* SET ELEMENT AT INDEX O(n) */
        rollno.set(2, 10);
        System.out.println(rollno);

        /* CONTAINS ELEMENT RETURNS T/F */
        System.out.println(rollno.contains(10));// true
        System.out.println(rollno.contains(11));// false

        /* SIZE OF ARRAY LIST */
        System.out.println(rollno.size());
    }
}