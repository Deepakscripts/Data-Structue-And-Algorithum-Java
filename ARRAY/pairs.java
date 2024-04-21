public class pairs {
    
        // Function to print all pairs in an array
        static void printPairs(int[] arr) {
            System.out.println("Pairs in the array:");
    
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            printPairs(arr);
        }
    
    
}
