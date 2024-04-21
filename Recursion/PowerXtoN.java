public class PowerXtoN {

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * calcPower(x, n - 1);
        }
    }

    public static void printDec(int n, int x) {
        System.out.println(calcPower(x, n));
    }

    public static void main(String[] args) {
        int x = 5;
        int n = 5;
        printDec(n, x);
    }
}
