class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for( int i = 0; i < nums.length; i++)
            sum += nums[i];
        if(sum % 2 != 0)
            return false;
        boolean[] flag = new boolean[sum + 1];
        flag[ 0 ] = true;
        sum = sum / 2;
        for( int i : nums) {
            for (int j = sum; j > 0; j--) {
                if (j >= i ) {
                    flag[j] = flag[j] || flag[j - i];
                }
            }
        }
        return flag[sum];
    }
}
