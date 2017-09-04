public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans1 = new int[nums.length];
        ans1[0] = 1;
        for ( int i = 1; i < nums.length; i++) {
            ans1[i] = ans1[ i - 1] * nums[ i - 1];
        }
        int ans = 1;
        for ( int j = nums.length - 1; j >= 0; j--) {
            ans1[j] = ans1[j] * ans;
            ans = ans * nums[j];
        }
        return ans1;
    }
}
