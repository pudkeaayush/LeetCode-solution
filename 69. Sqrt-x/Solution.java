public class Solution {
    
    private int search( int x) {
        int left = 1;
        int right = x;
        int ans = 1;
        
        while ( left <= right ) {
            int mid = left + ( right - left ) / 2;
            if( mid == x / mid )
                return mid;
            else if( mid > x / mid)
                right = mid - 1;
            else {
                left = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    
    public int mySqrt(int x) {
        if( x == 0)
            return 0;
        return search(x);
    }
}
