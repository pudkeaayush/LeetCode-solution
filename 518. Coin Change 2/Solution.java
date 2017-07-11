/* The main idea in this code is that the different ways of getting an amount is either by taking that coin or by ignoring that coin.
We iterate through all the coins and for each coin, calculate the ways in which that coin can contribute to the amount. */
public class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[ 0 ] = 1;
        for ( int j = 0; j < coins.length; j++) {
            for ( int i = 1; i <= amount; i++) {
                if( coins[j] <= i) {
                        dp[ i ] += dp[ i - coins[j] ];
                }
            }
        }
        return dp[amount];
    }
}
