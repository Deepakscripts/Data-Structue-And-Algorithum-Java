public class FactorialOfN {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void printDec(int n) {
       
        System.out.println(factorial(n));
        
    }

    public static void main(String[] args) {
        int n = 5;
        printDec(n);
    }

}
