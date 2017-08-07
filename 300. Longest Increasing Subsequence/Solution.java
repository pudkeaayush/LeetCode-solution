public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] ans = new int[ nums.length ];
        for ( int i = 0; i < ans.length; i++)
            ans[i] = 1;
            
        for ( int i = 0; i < nums.length; i++) {
            for ( int j = 0; j < i; j++ ) {
                if( i == j)
                    continue;
                if( nums[j] < nums[i]) {
                    ans[i ] = Math.max( ans[i] , ans[ j ] + 1);
                }
            }
        }
        
        int max = 0;
        for ( int i = 0; i < ans.length; i++) {
            max = Math.max ( max , ans[i]);
        }
        return max;
    }
}
