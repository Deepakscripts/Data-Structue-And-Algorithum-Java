public class Fibonacci {

    public static int calFibonacciForN(int n) {
        /* BASE CASE */
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        /* FIB OF n-1 */
        int n1 = calFibonacciForN(n - 1);
        /* FIB OF -1 */
        int n2 = calFibonacciForN(n - 2);
        /* FIB of n */
        int fib = n1 + n2;
        return fib;

    }

    public static void main(String[] args) {
        int n = 40;
        int result = calFibonacciForN(n);
        System.out.println(result);
    }
}
