public class holloRhombus {
    public static void printHollowRhombus(int rows) {
        // Upper part of the rhombus
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= rows; j++) {
                // Print boundary asterisks
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for hollow part
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; // Change this to adjust the size of the rhombus
        printHollowRhombus(rows);
    }
}
