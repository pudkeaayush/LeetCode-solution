class Solution {
    public void dfs( int i , int j , int[][] grid , int startx , int starty, StringBuilder str) {
        if(i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1 || grid[i][j] == 0)
            return;
        grid[i][j] = 0;
        
        dfs( i + 1 , j , grid , startx , starty , str.append("d"));
        dfs( i - 1 , j , grid, startx , starty , str.append("u"));
        dfs( i , j - 1 , grid, startx , starty , str.append("l"));
        dfs( i , j + 1 , grid, startx , starty , str.append("r"));
        
    }
    public int numDistinctIslands(int[][] grid) {
        int count = 0;
        Set < String > set = new HashSet < String >();
        for( int i = 0; i < grid.length; i++) {
            for( int j = 0;  j < grid[0].length; j++) {
                if( grid[i][j] == 1) {
                    StringBuilder str = new StringBuilder();
                    dfs( i , j , grid , i , j , str);
                    set.add(str.toString());
                }
            }
        }
        return set.size();
    }
    
}
