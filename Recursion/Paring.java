public class Paring {
    public static int pairing(int n) {
        /* BASE CASE */
        if (n == 1 || n == 2) {
            return n;
        }
        /* SINGLE */
        int fnm1 = pairing(n - 1);

        /* PAIRING */
        int fnm2 = pairing(n - 2);
        int pairways = (n - 1) * fnm2;

        /* TOTAL WAYS */
        int totalways = fnm1 + pairways;
        return totalways;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(pairing(n));
    }
}