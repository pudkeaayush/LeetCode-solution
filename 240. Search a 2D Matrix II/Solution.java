public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if( matrix.length == 0 || matrix[0].length == 0)
            return false;
        int i = 0;
        int j = matrix[0].length - 1;
        int element = matrix[ i ][ j ];
        
        while( i < matrix.length && j > -1) {
            element = matrix[ i ][ j ];
            if( element == target)
                return true;
            else if( element > target) {
                j = j - 1;
            }
            else {
                i = i + 1;
            }
        }
        return false;
    }
}
