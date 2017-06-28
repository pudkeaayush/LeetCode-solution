/* The idea is that we find the difference between the gas[i] and cost[i] and add it to the total so far. If the total is less than the
minimum total till now, then we mark this as minimum and make the next element as the starting point. */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int total_so_far = 0;
        int min = Integer.MAX_VALUE;
        int index = -1;
        
        for ( int i = 0; i < gas.length; i++) {
            total_so_far += gas[ i ] - cost[ i ];
            if ( total_so_far < min) {
                min = total_so_far;
                index = i + 1;
            }
        }
        if( total_so_far >= 0 )
            return index % gas.length;
        else
            return -1;
    }
}
