public class natural {

    public static int naturalno(int n) {
        if (n == 1) {
            return 1;
        }
        return n + naturalno(n - 1);
    }

    public static void printDec(int n) {

        System.out.println(naturalno(n));

    }

    public static void main(String[] args) {
        int n = 5;
        printDec(n);
    }

}
