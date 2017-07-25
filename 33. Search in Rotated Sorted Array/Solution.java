public class Solution {
    public int searchRotated( int[] nums , int target , int start , int end) {
        if(start > end)
            return -1;
        int mid = start + (end - start) / 2; 
        if(nums[mid] == target)
            return mid;
        //Sorted
        else if( nums[mid] >= nums[start]) {
            if(nums[start] <= target && target <= nums[mid])
                return searchRotated(nums , target , start , mid - 1);
            else
                return searchRotated(nums , target , mid + 1 , end);
        }
        else {
            if(nums[mid + 1] <= target && nums[end] >= target)
                return searchRotated( nums , target , mid + 1, end);
            else
                return searchRotated( nums , target , start , mid - 1);
        }
    }
    
    public int search(int[] nums, int target) {
        return searchRotated(nums , target , 0 , nums.length - 1 );
    }
}
