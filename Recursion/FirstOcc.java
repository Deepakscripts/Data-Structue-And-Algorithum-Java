public class FirstOcc {

    public static int firstOcc(int arr[], int i, int key) {

        int n = arr.length;

        /* BASE CASE */
        if (i == n) {
            return -1; // Element not found
        }

        if (arr[i] == key) {
            return i; // Found the key
        }

        return firstOcc(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 3, 7, 8, 11, 3 };
        int key = 3;
        int firstIndex = firstOcc(arr, 0, key); // Start from index 0
        if (firstIndex >= 0) {
            System.out.println("First occurrence index: " + firstIndex);
        } else {
            System.out.println("No Occurrence Found");
        }
    }
}
