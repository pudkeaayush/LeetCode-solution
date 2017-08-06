public class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1 , high = nums.length - 1 , mid = 0 , count = 0;
        while ( low < high) {
            mid = ( low + (high - low) / 2);
            count = 0;
            for( int i = 0; i < nums.length; i++) {
                if(nums[i] <= mid)
                    count++;
            }
            if(count > mid)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}
