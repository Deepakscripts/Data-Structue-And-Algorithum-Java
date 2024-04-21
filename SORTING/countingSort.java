public class countingSort {
    
    public static void countingsort(int[] arr) {
        /* FINDING LARGEST NUMBER FOR RANGE */
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        /* COUNT ARRAY WHICH IS STORING FREQUENCY */
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        /* SORTING */
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 4, 5, 7, 8, 9, 3, 3 };
        countingsort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");

        }
    }
}
