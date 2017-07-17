public class Solution {
    
    private int getCandidate( int[] nums) {
        int count = 1;
        int index = 0;
        for ( int i = 1; i < nums.length; i++) {
            if(nums[index] == nums[i])
                count++;
            else
                count--;
            if( count == 0) {
                count = 1;
                index = i;
            }
        }
        return nums[index];
    }
    
    private int countCandidate( int candidate , int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == candidate)
                count++;
        }
        return count;
    }
    
    public int majorityElement(int[] nums) {
        if( nums.length == 0)
            return 0;
        int candidate = getCandidate(nums);
        //System.out.println(candidate);
        int count = countCandidate(candidate , nums);
        //System.out.println(count);
        return count >= nums.length / 2 ? candidate : -1;
    }
}
