public class reverse {

    // Function to reverse the array
    public static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move to next elements
            start++;
            end--;
        }
    }

    // Function to print the array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Original array:");
        printArray(arr);

        reverseArr(arr);
        System.out.println("Reversed array:");
        printArray(arr);
    }

}
