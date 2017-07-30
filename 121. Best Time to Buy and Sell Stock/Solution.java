public class Solution {
    public int maxProfit(int[] prices) {
        int maxsoFar = 0;
        int minsoFar = Integer.MAX_VALUE;
        
        for ( int i = 0; i < prices.length; i++) {
            if(prices[i] < minsoFar)
                minsoFar = prices[i];
            if( prices[i] - minsoFar > maxsoFar)
                maxsoFar = prices[i] - minsoFar;
        }
        return maxsoFar;
    }
}
