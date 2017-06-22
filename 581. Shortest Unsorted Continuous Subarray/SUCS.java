/* The idea is to sort the array and start comparing the the sorted array with the original array. We keep incrementing start pointer if the elements 
from the front are same and keep decrementing end pointer if the elements from the end are same. As soon as both are different return their difference
else increment the start or end pointer accordingly.*/

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        if( nums.length == 1)
            return 0;
        int[] nums_temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums_temp);
        int start = 0;
        int end = nums.length - 1;
        while( true ) {
            if(start > end || nums_temp[start] != nums[ start ] && nums_temp[end] != nums[end])
                break;
            if( nums_temp[start] == nums[ start ])
                start++;
            if( nums_temp[end] == nums[end])
                end--;
            
            
        }
        if( start < end)
            return end - start + 1;
        else
            return 0;
        
    }
}
