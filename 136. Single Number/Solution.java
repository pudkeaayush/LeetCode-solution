public class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        if( nums.length == 1)
            return nums[0];
        ans = nums[ 0 ];
        for ( int i = 1; i < nums.length; i++) {
            ans = nums[i ] ^ ans;
        }
        return ans;
    }
}
