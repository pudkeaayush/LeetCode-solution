/* The simple idea here is that we have to iterate from 1 to the amount and for each iteration, we are trying to find the minimum amount of
coins at each step. If a coin's denomination is lesser than or equal to the amount then we take the minimum of the current value of the dp table and the dp table corresponding to the amount minus the denomination of the coin. */

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for ( int i = 1; i <= amount; i++) {
            dp[ i ] = Integer.MAX_VALUE;
            for ( int j = 0; j < coins.length; j++) {
                if( coins[j] <= i && dp[ i - coins[j] ] != Integer.MAX_VALUE) {
                    //System.out.println(i + " " + coins[j]);
                    dp[ i ] = Math.min( dp[ i ] , dp[ i - coins[j] ] + 1);
                }
            }
        }
        if( dp[ amount ] != Integer.MAX_VALUE)
            return dp[amount];
        else
            return -1;
    }
}
