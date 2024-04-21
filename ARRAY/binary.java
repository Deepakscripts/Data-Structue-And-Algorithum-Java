public class binary {
    // Function to perform binary search
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;
            // If target is greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;
            // If target is smaller, ignore right half
            else
                right = mid - 1;
        }
        // If target is not present in array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 1;
        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element is present at index " + result);
        else
            System.out.println("Element is not present in array");
    }
}

