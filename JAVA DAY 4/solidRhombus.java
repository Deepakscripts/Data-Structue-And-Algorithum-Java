public class solidRhombus {

    public static void printSolidRhombus(int rows) {
        // Upper part of the rhombus
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; // Change this to adjust the size of the rhombus
        printSolidRhombus(rows);
    }
}
