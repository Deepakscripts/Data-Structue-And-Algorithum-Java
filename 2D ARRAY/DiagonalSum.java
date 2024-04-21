public class DiagonalSum {

    public static void printDiagnoalSum(int matrix[][]) {
        int startRow = 0;
        int startCol = 0; // Corrected a typo in variable name
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        int leftToRight = 0;
        int rightToLeft = 0;

        /* LEFT TO RIGHT SUM */
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                if (i == j) { // Add only when i == j, which indicates it's on the diagonal
                    leftToRight += matrix[i][j];
                }
            }
        }
        System.out.println("Left to right sum = " + leftToRight);

        /* RIGHT TO LEFT SUM */
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                if (i + j == endRow) { // Add only when i + j == endRow, which indicates it's on the other diagonal
                    rightToLeft += matrix[i][j];
                }
            }
        }
        System.out.println("Right to left sum = " + rightToLeft);

        int finalSum = leftToRight + rightToLeft;
        System.out.println("Final sum of both Diagonal = " + finalSum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printDiagnoalSum(matrix);
    }
}
