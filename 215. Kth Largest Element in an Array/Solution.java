public class Solution {
    
    private void swap( int[] nums , int i , int j) {
        int temp = nums[i];
        nums[ i ] = nums[ j ];
        nums[ j ] = temp;
    }
    private void printArray(int[] nums) {
        for ( int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
    private int quickSelect( int[] nums , int k , int start , int end) {
        int pivot = end;
        int left = 0;
        while(true) {
            if( start == end)
                return nums[start];
            left = start;
            for ( int i = start; i < end; i++) {
                if(nums[i] < nums[pivot]) {
                    swap(nums , i , left);
                    left++;
                }
            }
            swap( nums , left , pivot);
            //printArray(nums);
            if( left == (nums.length - k) )
                return nums[left];
            else if( left < nums.length - k) {
                start = left + 1;
            }
            else {
                pivot = left - 1;
                end = left - 1;
            }
        }
        
    }
    
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums , k , 0 , nums.length - 1);
    }
}
