public class Solution {
    class myComparator implements Comparator <int[] > {
        public int compare( int[] point1 , int[] point2) {
            return point1[1] - point2[1];
        }    
    }
    
    public int findMinArrowShots(int[][] points) {
        if ( points.length == 0)
            return 0;
        Arrays.sort( points , new myComparator() );
        int count = 1;
        int min = points[0][1];
        for ( int i = 1; i < points.length; i++) {
            if( points[i][0] <= min && min <= points[i][1])
                continue;
            else {
                count++;
                min = points[i][1];
            }
        }
        return count;
    }
}
