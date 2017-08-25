public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n - 1;
        if( left == right)
            return left + 1;
        while( left < right) {
            int mid = left + ((right - left ) / 2);
            if( isBadVersion(mid + 1) )
                right = mid;
            else
                left = mid + 1;
        }
        return left + 1;
        
    }
}
