class Solution {
    public int totalHammingDistance(int[] nums) {
        int len = nums.length;
        int total = 0;
        for( int i = 0; i < 32; i++) {
            int countBits = 0;
            for( int j = 0; j < len; j++) {
                countBits += (nums[j] >> i) & 1;
            }
            total += countBits * ( len - countBits);
        }
        return total;
    }
}
