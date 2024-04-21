public class Nqueens {

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
    

    public static void nQueens(char board[][], int row) {
        /* BASE CASE */
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        /* COLUMN LOOP */
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                /* RECURSIVE CALL */
                nQueens(board, row + 1);
                /* BACK TRACK */
                board[row][j] = 'X';
            }

        }
    }
    static int count = 0;

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
        int n = 5 ;
        char board[][] = new char[n][n];
        /* INITIALIE */
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        int row = 0;
        nQueens(board, row);
        System.out.println("There are "  + count + " Solutions");
    }
}
/* O(n!) */