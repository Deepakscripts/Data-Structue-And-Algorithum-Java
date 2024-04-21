public class brute {

    // Function to print all subarrays of an array along with their sum
    static void printSubarraysWithSum(int[] arr) {
        
        int largest = Integer.MIN_VALUE; // Initialize the largest sum
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0; // Reset currSum for each new subarray

                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }

                // Update the largest sum if currSum is greater
                if (largest < currSum) {
                    largest = currSum;
                }
            }
        }
        System.out.println("Largest Sum: " + largest); // Print the largest sum after all subarrays are processed
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, -5, -10, 11, 20, 74 };
        printSubarraysWithSum(arr);
    }

}
