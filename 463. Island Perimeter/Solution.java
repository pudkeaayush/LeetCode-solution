public class Solution {
    
    public boolean left ( int[][] grid , int i , int j , boolean[][] visited) {
        if( j > 0 )
            if( grid[i][ j - 1] == 1 && visited[i][ j - 1] == true) {
                //System.out.println( i + " " + j + "left");
                return true;
            }
        return false;
    }
    
    public boolean right ( int[][] grid , int i , int j , boolean[][] visited) {
        if ( j < grid[0].length - 1)
            if( grid[i][ j + 1] == 1 && visited[i][ j + 1] == true) {
                //System.out.println( i + " " + j + "right");
                return true;
            }
        return false;
    }
    
    public boolean bottom ( int[][] grid , int i , int j, boolean[][] visited) {
        if( i < grid.length - 1 )
            if( grid[i + 1][ j ] == 1 && visited[i + 1][ j ] == true) {
                //System.out.println( i + " " + j + "bottom");
                return true;
            }
        return false;
    }
    
    public boolean top ( int[][] grid , int i , int j , boolean[][] visited) {
        if( i > 0)
            if( grid[i - 1][ j ] == 1 && visited[i - 1][ j ] == true) {
                //System.out.println( i + " " + j + "top");
                return true;
            }
        return false;
    }
    
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        boolean [][] visited = new boolean [ grid.length ][ grid[0].length ];
        for ( int i = 0; i < grid.length; i++) {
            for ( int j = 0; j < grid[0].length; j++) {
                if( grid[i][j] == 1)
                    result += 4;
                if( grid[i][j] == 1 && left(grid , i , j , visited) )
                    result -= 2;
                if( grid[i][j] == 1 && right( grid , i , j , visited) )
                    result -= 2;
                if( grid[i][j] == 1 && bottom ( grid , i , j , visited) )
                    result -= 2;
                if( grid[i][j] == 1 && top( grid , i , j , visited)  )
                    result -= 2;
                visited[i][j] = true;
            }
        }
        return result;
    }
}
