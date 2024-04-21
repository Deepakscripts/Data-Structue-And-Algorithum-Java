class Decresingno {
    public static void printDec(int n) {
        /* base class to prevent Stack Overflow */
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}