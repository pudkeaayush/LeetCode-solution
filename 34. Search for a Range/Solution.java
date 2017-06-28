/* The main idea is to compare the middle element with the target. If the middle element is equal to the target and the start and end elements are equal to the middle element too, then return the start and end index. Else if the start element and the middle element are same but the end is not, decrement the end count by 1. Similarly, if the middle element and the end element are the same and the start element is not, then increment the start element. If the middle element is not the same as target, if it is greater than target then
    set the end as mid - 1 else if it is lesser then set the start value to mid + 1. */
public class Solution {
    
    public int[] binarySearch( int[] nums , int target , int start , int end) {
        if( start > end)
            return new int[]{-1,-1};
        int mid = 0;
        while ( start <= end ) {
            mid = start + (end - start) / 2;
            //System.out.println(start + " " + mid + " " + end);
            if(nums[mid] == target && nums[ start ] == target && (start == 0 || nums[start - 1] != target) && nums[end] == target &&(end == nums.length - 1 || nums[end] != nums[end + 1]) )
                return new int[]{ start , end };
            else if(nums[mid] == target && nums[ start ] == target && (start == 0 || nums[start - 1] != target) && nums[ end  ] != target )
                end = end - 1;
            else if(nums[mid] == target && nums[ start ] != target && nums[ end  ] == target && ( end == nums.length - 1 || nums[end] != nums[end + 1] ) )
                start = start + 1;
            else if(nums[mid] == target && nums[start ] != target && nums[end] != target) {
                start = start + 1;
                end = end - 1;
            }
            else if( nums[mid] != target && target > nums[mid])
                start = mid + 1;
            else if( nums[mid] != target && target < nums[mid])
                end = mid - 1;
            else {
                System.out.print("hey");
            }
        }
        return new int[]{ - 1 , -1};
    }
    
    public int[] searchRange(int[] nums, int target) {
        return binarySearch(nums , target , 0 , nums.length - 1);    
    }
}
