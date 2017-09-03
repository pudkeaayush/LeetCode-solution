class Solution {
    
    public int find( int element , int[] parent ) {
        if(parent[element] == -1)
            return element;
        return find(parent[element] , parent);
    }
    
    public void union( int a , int b) {
        
    }
        
    public boolean validTree(int n, int[][] edges) {
        int parent[] = new int[n];
        Arrays.fill(parent,-1);
        for( int i = 0; i < edges.length; i++ ) {
            
            int x = find(edges[i][0] , parent);
            int y = find(edges[i][1] , parent);
            
            if( x == y )
                return false;
            
            parent[x] = y;
            
        }
        return edges.length == n - 1;
    }
}
