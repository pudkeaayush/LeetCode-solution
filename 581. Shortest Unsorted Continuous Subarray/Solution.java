public class Solution {
    /* The idea is to first find the smallest no. from left that is lesser than i - 1. Call this min. Next find the largest no. from right that is greater
    than i + 1. Call this max. Next, find the first number from left that is greater than the min. Call this l. Now, find the first no. from
    right that is smaller than max. Call this r. Return r - l + 1. */
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for( int i = 1; i < nums.length; i++) {
            if( nums[i] < nums[ i - 1])
                min = Math.min( nums[i] , min);
        }
        for( int i = nums.length - 2; i >= 0; i--) {
            if( nums[i] > nums[ i + 1])
                max = Math.max( nums[i] , max);
        }
        int l = 0;
        int r = 0;
        for( int i = 0; i < nums.length; i++) {
            if( nums[i] > min) {
                l = i;
                break;
            }
        }
        for( int i = nums.length - 1; i >= 0; i--) {
            if( nums[i] < max) {
                r = i;
                break;
            }
        }
        if( l == 0 && r == 0)
            return 0;
        else
            return r - l + 1;
        
    }
    /* The idea is to sort the array and start comparing the the sorted array with the original array. We keep incrementing start pointer if the elements 
    from the front are same and keep decrementing end pointer if the elements from the end are same. As soon as both are different return their difference
    else increment the start or end pointer accordingly. Complexity is O(nlogn). */

    /*
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
        
    }*/
}
