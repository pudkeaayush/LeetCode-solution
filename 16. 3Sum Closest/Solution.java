public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int result = 0;
        for( int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while( left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if( Math.abs(target - sum)  < ans) {
                    ans = Math.abs(target - sum);
                    result = sum;
                    if( result == target)
                        return result;
                }
                if( sum > target)
                    right--;
                else
                    left++;
            }
        }
        return result;
    }
}
