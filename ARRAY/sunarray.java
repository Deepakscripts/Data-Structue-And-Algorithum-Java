public class sunarray {
    // Function to print all subarrays of an array along with their sum
    static void printSubarraysWithSum(int[] arr) {
        System.out.println("Subarrays of the array:");

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                
                sum += arr[j];
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println("=> Sum: " + sum);

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        printSubarraysWithSum(arr);
    }
}
