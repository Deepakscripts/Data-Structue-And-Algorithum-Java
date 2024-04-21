public class selection {
    
        public static void selectionSort(int[] arr) {
            int n = arr.length;
    
            // One by one move the boundary of the unsorted subarray
            for (int i = 0; i < n; i++) {
                // Find the minimum element in the unsorted array
                int minElement = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minElement]) {
                        minElement = j;
                    }
                }
    
                // Swap the found minimum element with the first element
                int temp = arr[minElement];
                arr[minElement] = arr[i];
                arr[i] = temp;
                System.out.print(arr[i] + " ");
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};
            selectionSort(arr);
           
            
        }
    
    
}
