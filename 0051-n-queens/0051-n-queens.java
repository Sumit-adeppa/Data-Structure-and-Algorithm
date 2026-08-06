class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        nQueen(board, 0, result);

        return result;
    }

    private void nQueen(char[][] board, int row, List<List<String>> result) {

        // Base Case
        if (row == board.length) {
            result.add(construct(board));
            return;
        }

        // Try every column
        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                nQueen(board, row + 1, result);

                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col) {

        // Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Left Diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Right Diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private List<String> construct(char[][] board) {

        List<String> temp = new ArrayList<>();

        for (char[] row : board) {
            temp.add(new String(row));
        }

        return temp;
    }
}