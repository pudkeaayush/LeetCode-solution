public class Solution {
    public int maxProduct(int[] nums) {
        if( nums.length == 1)
            return nums[ 0 ];
        int max_till_now = 1;
        int min_till_now = 1;
        int max_global = Integer.MIN_VALUE;
        for ( int i = 0; i < nums.length; i++) {
            if( nums[ i ] < 0) {
                int temp = max_till_now;
                max_till_now = min_till_now;
                min_till_now = temp;
            }
            max_till_now = Math.max(max_till_now * nums[ i ] , nums[ i ]);
            min_till_now = Math.min( min_till_now * nums[ i ] , nums[ i ]);
            //System.out.println(max_till_now + " " + min_till_now);
            max_global = Math.max(max_global , max_till_now);
        }
        
    
        return max_global;
    }
}
