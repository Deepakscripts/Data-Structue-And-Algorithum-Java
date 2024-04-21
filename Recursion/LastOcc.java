public class LastOcc {

    public static int lastOcc(int arr[], int i, int key) {
        /* BASE CASE */
        if (i == arr.length) {
            return -1; 
        }

        int isFound = lastOcc(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = { 1,  4, 5, 5, 5, 7, 8, 11, 0 };
        int key = 2;
        int lastIndex = lastOcc(arr, 0, key);
        if (lastIndex >= 0) {
            System.out.println("Last occurrence index: " + lastIndex);
        } else {
            System.out.println("No Occurrence Found");
        }
    }

}
