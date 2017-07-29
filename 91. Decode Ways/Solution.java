public class Solution {
    public int numDecodings(String s) {
        if( s.length() == 0)
            return 0;
        int n = s.length();
        int[] dp = new int[s.length() + 1];
        dp[n] = 1;
        if(s.charAt(n-1) != '0')
            dp[n - 1] = 1;
        else
            dp[n - 1] = 0;
        for ( int i = n - 2; i >= 0; i-- ) {
            if(s.charAt(i) == '0') {
                continue;
            }
            if(Integer.parseInt(s.substring(i ,i+2)) <= 26) 
                dp[ i ] = dp[ i + 1] + dp [i + 2];
            else
                dp[ i] = dp[ i + 1];
        }
        return dp[0];
    }
}
