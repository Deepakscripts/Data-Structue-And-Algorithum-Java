public class SortedAndRotated {

    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1; // Base case: element not found
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid; // Case found
        }

        // Check if the left half is sorted
        if (arr[si] <= arr[mid]) {
            if (target >= arr[si] && target <= arr[mid]) {
                // If target is within the sorted left half, search there
                return search(arr, target, si, mid - 1);
            } else {
                // Otherwise, search in the right half
                return search(arr, target, mid + 1, ei);
            }
        }

        // If the right half is sorted
        
            if (target >= arr[mid] && target <= arr[ei]) {
                // If target is within the sorted right half, search there
                return search(arr, target, mid + 1, ei);
            } else {
                // Otherwise, search in the left half
                return search(arr, target, si, mid - 1);
            }
        

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 ,3};
        int target = 3;
        int targetIndex = search(arr, target, 0, arr.length - 1);
        System.out.println(targetIndex);
    }
}
