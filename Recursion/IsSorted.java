public class IsSorted {

    public static boolean isSorted(int arr[], int i) {

        int n = arr.length - 1;

        /* BASE CASE */
        if (i == n) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i++);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int i = 0;
        isSorted(arr, i);
    }
}
