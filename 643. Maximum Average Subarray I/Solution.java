public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE , sum = 0;
        int index = 0 , j = 1 , temp_k = k;
        for( int i = 0; i < k; i++)
            sum += nums[ i ];
        max = Math.max( max , sum / k);
        while( j <= nums.length - k) {
            sum -= nums[ index ];
            sum += nums[temp_k];
            max = Math.max ( sum / k, max );
            index ++;
            temp_k++;
            j++;
        }
        return max;
    }
}
