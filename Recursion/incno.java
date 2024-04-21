public class incno {

    public static void printIec(int n) {
        /* base case to prevent Stack Overflow */
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIec(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        printIec(n);
    }

}
