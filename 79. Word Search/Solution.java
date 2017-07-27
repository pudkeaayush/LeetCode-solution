public class Solution {
    
    public boolean helper ( char[][] board , int i , int j , int len , String word , int index , boolean[][] visited)
    {
        if(len == word.length() )
            return true;
        else {
            if( i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || visited[i][j] )
            return false;
            if( board[i][j] == word.charAt(index) ) {
                visited[i][j] = true;
                boolean result = helper(board , i - 1 , j , len + 1, word , index + 1 , visited) || helper(board , i + 1 , j , len + 1, word , index + 1 , visited) || helper(board , i , j - 1, len + 1 , word , index + 1 , visited) || helper(board , i , j + 1, len + 1, word , index + 1 , visited) ;
                visited[i][j] = false;
                return result;
            }
            else
                return false;
        }    
    }
    
    public boolean exist(char[][] board, String word) {
        if( word.length() == 0 || word == null)
            return true;
        if( board.length == 0 || board == null)
            return false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for ( int i = 0; i < board.length; i++) {
            for ( int j = 0; j < board[0].length; j++) {
                if(helper ( board , i , j , 0 , word , 0 , visited))
                    return true;
            }
        }
        return false;
    }
}
