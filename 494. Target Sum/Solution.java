class Solution {
    
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for( int i : nums)
            sum += i;
        if(( sum + S) % 2 != 0 || sum < S )
            return 0;
        int newSum = (sum + S) / 2;
        int[] dp = new int[newSum + 1];
        dp[ 0 ] = 1;
        for( int i : nums) {
            for( int j = newSum; j >= i; j--) {
                dp[j] += dp[j - i];
            }
        }
        return dp[newSum];
    }
}
