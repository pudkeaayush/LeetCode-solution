public class Solution {
    
    public boolean isValidSudoku(char[][] board) {
        
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] smallSquare = new int[9][9];
        
        for ( int i = 0; i < 9; i++) {
            for ( int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    int c = board[i][j] - '0' - 1;
                    int k = (i / 3 * 3) + ( j / 3);
                    if(row[i][c] == 1|| col[j][c] == 1 || smallSquare[k][c] == 1)
                        return false;
                    row[i][c] = 1;
                    col[j][c] = 1;
                    smallSquare[k][c] = 1;
                }
            }
        }
        return true;
    }
}
