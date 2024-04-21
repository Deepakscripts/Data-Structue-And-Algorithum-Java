public class bubble {
    public static void bubbleSort(int array[]) {

        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            // Move this outside the inner loop
            if (!swapped) {
                break;
            }
        }
        // Print the sorted array outside the loop
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 45, 8, 2, 7, 3, 10, 75, 22, 98 };
        bubbleSort(arr);
    }
}

