public class Solution {
    
    public void printMatrix(int[][] matrix) {
        for ( int i = 0; i< matrix.length; i++) {
            for ( int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        
    }
    
    public void reverseRotateUptoDown( int[][] matrix) {
        int len = matrix[0].length;
        int temp = 0;
        for( int i = 0; i < matrix.length / 2; i++) {
            for ( int j = 0; j < matrix.length; j++) {
                temp = matrix[i][ j ];
                matrix[ i ][ j ] = matrix[len - 1][ j ];
                matrix[ len - 1 ][ j ] = temp;
            }
            len--;
        }
    }
    
    public void reverseRotateLefttoRight( int[][] matrix) {
        int len = matrix.length - 1;
        int temp = 0;
        for( int i = 0; i < matrix[0].length / 2; i++ ){
            for ( int j = 0; j < matrix.length; j++) {
                temp = matrix[ j ][ i ];
                matrix[ j ][ i ] = matrix [ j ][ len ];
                matrix[ j ][ len ] = temp;
            }
            len--;
        }
    }
    
    public void swapSymmetry( int[][] matrix) {
        int temp = 0;
        for ( int i = 0; i < matrix.length; i++) {
            for ( int j = i + 1; j < matrix[0].length; j++) {
                temp = matrix[i][j];
                matrix[ i ][ j ] = matrix[ j ][ i ];
                matrix[ j ][ i ] = temp;
            }
                
        }
    }
    
    // requires extra memory to allocated the new matrix
    public void rotateWithExtraMemory(int[][] matrix) {
        int temp = 0;
        int max = matrix.length - 1;
        int len = max;
        int temp_matrix[][] = new int[matrix.length][matrix[0].length];
        for( int i = 0; i < matrix.length; i++) {
            for ( int j = 0;  j < matrix[0].length; j++) {
                temp_matrix[ i ][ j ] = matrix[ max ][ i ];
                max--;
            }
            printMatrix(temp_matrix);
            max = len;
        }
        for( int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = temp_matrix[i][j];
        }
    }
    
    public void rotate(int[][] matrix) {
        /**/
        //reverseRotateUptoDown(matrix);
        //printMatrix(matrix);
        swapSymmetry(matrix);
        reverseRotateLefttoRight(matrix);
    }
}
