public class NqueensOneSol {

    public static boolean isSafe(char board[][], int row, int col) {
        // Check for the same column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check for the left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check for the right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        /* BASE CASE */
        if (row == board.length) {
            printBoard(board);
            return true; // Solution found
        }
        /* COLUMN LOOP */
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                /* RECURSIVE CALL */
                if (nQueens(board, row + 1)) {
                    return true; // Solution found, stop further exploration
                }
                /* BACK TRACK */
                board[row][j] = 'X';
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println(" -------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 10;
        char board[][] = new char[n][n];
        /* INITIALIZE */
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        int row = 0;
        if (nQueens(board, row)) {
            System.out.println("Solution is Possible");
        } else {
            System.out.println("Solution is not Possible");
        }
    }
}
