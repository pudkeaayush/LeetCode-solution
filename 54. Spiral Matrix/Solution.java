/* Here we can adopt two different approaches. One of the approach is using extra memory of n * m size. In this case we allocated a new
matrix of size n * m and put elements in spiral format starting from left to right, top to bottom , right to left and bottom to up.
We make use of a visited matrix array to know till what point we need to go. 
A better method would be to use 4 different variables, rowStart , rowEnd , colStart and colEnd. Each time we have traversed a row from
left to right , increment the rowStart counter. Each time we traverse a column from top to bottom, we decrement the colEnd counter.
Each time we traverse a row from right to left, we decrement the rowEnd counter and each time we traverse from bottom to top, we increment
the colStart counter. */

public class Solution {
    
    private int startX = 0;
    private int startY = 0;
    int count = 0;
    
    private void goRight( int[][] matrix , List < Integer > arr , boolean[][] visited) {
        while(startY < matrix[0].length -  1 && !visited[startX][startY + 1] ) {
            System.out.println(startX + " " + startY);
            startY++;
            count++;
            arr.add(matrix[startX][startY]);
            visited[startX][startY] = true;
        }
    }
    private void goDown( int[][] matrix , List < Integer > arr , boolean[][] visited) {
        while(startX < matrix.length - 1 && !visited[startX + 1][startY]) {
            startX++;
            count++;
            arr.add(matrix[startX][startY]);
            visited[startX][startY] = true;
            System.out.println(startX + " " + startY);
        }
    }
    private void goLeft( int[][] matrix, List < Integer > arr , boolean[][] visited) {
        while(startY > 0 && !visited[startX][startY - 1]) {
            startY--;
            count++;
            arr.add(matrix[startX][startY]);
            visited[startX][startY] = true;
            System.out.println(startX + " " + startY);
        }
    }
    private void goUp(int[][] matrix , List < Integer > arr , boolean[][] visited) {
        while(startX > 0 && !visited[startX - 1][startY]) {
            startX--;
            count++;
            arr.add(matrix[startX][startY]);
            visited[startX][startY] = true;
            System.out.println(startX + " " + startY);
        }
    }
    
    // Requires extra memory
    public List < Integer > spiral(int[][] matrix) {
        List < Integer > arr = new ArrayList < Integer >();
        if(matrix.length == 0 || matrix[0].length == 0)
        	return arr;
        boolean[][] visited = new boolean[ matrix.length ][ matrix[ 0 ].length];
        arr.add(matrix[0][0]);
        visited[0][0] = true;
        count++;
        while( true ) {
            goRight(matrix , arr , visited);
            goDown(matrix , arr , visited);
            goLeft(matrix , arr , visited);
            goUp(matrix , arr , visited);
            if(count == matrix.length * matrix[0].length)
                break;
        }
        return arr;
    }
    
    void printArray( List < Integer > arr) {
        for ( Integer i : arr)
           	System.out.print(i + " ");
       	System.out.println();
    }
        
    public List<Integer> spiralOrder(int[][] matrix) {
        List < Integer > arr = new ArrayList <Integer>();
        if(matrix.length == 0 || matrix[0].length == 0)
        	return arr;
        
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        
        while ( rowStart <= rowEnd && colStart <= colEnd) {
            for ( int i = colStart; i <= colEnd; i++) {
                arr.add(matrix[rowStart][i]);
            }
            //printArray(arr);
            rowStart++;
            for ( int i = rowStart; i <= rowEnd; i++) {
                arr.add(matrix[i][colEnd]);
            }
            colEnd--;
            if( rowStart <= rowEnd) {
            	for ( int i = colEnd; i >= colStart; i--) {
                	arr.add(matrix[rowEnd][i]);
            	}
        	}
            rowEnd--;
            if(colStart <= colEnd) {
            	for ( int i = rowEnd; i >= rowStart; i--) {
                	arr.add(matrix[i][colStart]);
            	}
            }
            colStart++;
        }
        return arr;
    }
}
