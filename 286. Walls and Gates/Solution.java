class Solution {
    public void dfs( int[][] rooms , int i , int j , int dist) {
        if( i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] < dist) 
            return;
        rooms[ i ][ j ] = dist;
        dfs(rooms , i - 1, j , dist + 1);
        dfs( rooms , i + 1 , j , dist + 1);
        dfs( rooms , i , j + 1  , dist + 1);
        dfs( rooms , i , j - 1, dist + 1);
    }
    
    public void wallsAndGates(int[][] rooms) {
        for( int i = 0; i < rooms.length; i++) {
            for( int j = 0; j < rooms[0].length; j++)
                if(rooms[i][j] == 0)
                    dfs(rooms , i , j , 0);
        }
    }
}
