public class Solution {

    public boolean existsOrNot( char[][] board , String word , int len , int target , int i, int j , int index , boolean[][] visited) {
        if(len == target)
            return true;
        else {
            if( i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1 || visited[i][j])
                return false;
            if(board[i][j] == word.charAt(index)) {
                visited[i][j] = true;
                boolean result = existsOrNot( board , word , len + 1 , target , i + 1, j , index + 1 , visited) || existsOrNot( board , word , len + 1 , target , i - 1, j , index + 1 , visited) || existsOrNot( board , word , len + 1 , target , i , j + 1 , index + 1 , visited) || existsOrNot( board , word , len + 1 , target , i , j - 1 , index + 1 , visited);
                visited[i][j] = false;
                return result;
            }
            else
                return false;
        }
    }
    
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for ( int i = 0; i < board.length; i++) {
            for ( int j = 0; j < board[0].length; j++) {
                if( existsOrNot(board , word , 0 , word.length() , i , j , 0 , visited))
                    return true;       
            }
        }
        return false;
    }
}
