public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;
        
        for( int i = 0; i < nums.length; i++) {
            if( nums[i] <= one)
                one = nums[i];
            else if( nums[i] <= two)
                two = nums[i];
            else
                return true;
        } 
        return false;
    }
}
