/* The basic idea is to iterate over the array and check if an element is not 0. If so, swap it with index 0 of the array. Increment the
count of this index to be swapped to count + 1. Next time find an element which is non zero and swap it with this index and so on and so forth. */

public class Solution {
    
    public void swap( int a , int b , int[] nums) {
        int temp = nums[ a ];
        nums[ a ] = nums[ b ];
        nums[ b ] = temp;
    }
    public void moveZeroes(int[] nums) {
        int count = 0;
        for( int i = 0; i < nums.length; i++ ) {
            if( nums[ i ] != 0 ) {
                swap(count , i , nums );
                count++ ;
            }
        }
    }
}
