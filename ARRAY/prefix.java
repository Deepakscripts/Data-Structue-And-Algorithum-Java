public class prefix {

    // Function to print all subarrays of an array along with their sum
    static void printSubarraysWithSum(int[] arr) {

        int currSum = 0;
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        /* CALCULATE PREFIX */
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                /*
                 * for (int k = start; k <= end; k++) {
                 * currSum += arr[k];
                 * }
                 */

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
