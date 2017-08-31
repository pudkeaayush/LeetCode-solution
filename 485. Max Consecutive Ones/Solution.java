public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int max = Integer.MIN_VALUE;
        for( int i = 0; i < nums.length; i++) {
            if( nums[i] == 0)
                temp = 0;
            else
                temp = temp + 1;
            max = Math.max( max , temp);
        }
        return max;
    }
}
