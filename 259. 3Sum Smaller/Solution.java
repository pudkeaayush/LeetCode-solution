class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for( int i = 0; i < nums.length; i++) {
            int sum = 0;
            int left = i + 1;
            int right = nums.length - 1;
            while( left < right) {
                sum = nums[i] + nums[left] + nums[right];
                if(sum < target) {
                    count += right - left;
                    left++;
                }
                else
                    right--;
            }
        }
        return count;
    }
}
