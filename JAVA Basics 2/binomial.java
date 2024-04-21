 public class binomial {
    // Function to calculate the binomial coefficient
    static int binomialCoeff(int n, int k) {
        int[][] C = new int[n + 1][k + 1];
        
        // Calculate the binomial coefficient using dynamic programming
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i)
                    C[i][j] = 1;
                else
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }
        return C[n][k];
    }
    
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println("Binomial Coefficient of " + n + " and " + k + " is " + binomialCoeff(n, k));
    }

}
