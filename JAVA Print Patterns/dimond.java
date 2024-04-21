public class dimond {
    public static void printDiamond(int n) {
        // First half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Second half of the diamond
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDiamond(5);
    }
}
