public class Solution {
    public void swap( int[] nums , int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void printArray( int[] nums ) {
        for ( int i = 0; i < nums.length; i++)
            System.out.print(nums[i]);
        System.out.println();
    }
    
    public void sortColors(int[] nums) {
        int start_index = 0;
        int end_index = nums.length - 1;
        int i = 0;
        
        while( i < nums.length && start_index < end_index ) {
            if(nums[i] == 0 && start_index < i) {
                swap(nums , start_index , i);
                start_index++;
            }
            else if( nums[i] == 2 && end_index > i) {
                swap( nums , end_index , i);
                end_index--;
            }
            else {
                i++;
            }
            //printArray(nums);
        }
    }
}
