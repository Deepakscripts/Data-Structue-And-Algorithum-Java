import java.util.*;

public class MultiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list1.add( 2 * i);
            list2.add( 3 * i);
            list3.add( 4 * i);

        }
        MainList.add(list1);
        MainList.add(list2);
        MainList.add(list3);
        System.out.print(MainList + " ");
        System.out.println();
        System.out.println(" ************* ");

        /* ACCESS INSIDE ARRAY LISTS OF ARRAY LIST */
        for (int j = 0; j < MainList.size(); j++) {
            ArrayList<Integer> CURRENTLIST = MainList.get(j);
            for (int k = 0; k < CURRENTLIST.size(); k++) {
                System.out.print(CURRENTLIST.get(k) + " ");
            }
            System.out.println();
        }
    }
}
