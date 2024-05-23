import java.util.*;

public class UnionandIntersection {

    public static HashSet<Integer> union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }
        return set;
    }

    public static HashSet<Integer> intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                resultSet.add(arr2[i]);
            }
        }

        return resultSet;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> res1 = union(arr1, arr2);
        HashSet<Integer> res2 = intersection(arr1, arr2);

        System.out.println("Union: " + res1);
        System.out.println("Intersection: " + res2);
    }
}
