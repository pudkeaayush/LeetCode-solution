public class Solution {
    public int countPrimes(int n) {
        if( n == 0 || n == 1)
            return 0;
        boolean[] flag = new boolean[n];
        Arrays.fill(flag , true);
        for ( int i = 2; i < Math.ceil(Math.sqrt(n)); i++ ) {
            if(flag[i] == true) {
                for ( int j = i + i; j < n; j = j + i) {
                    flag[j] = false;
                }
            }
        }
        int count = 0;
        for ( int i = 2 ; i < n; i++) {
            if(flag[i] == true) {
                //System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
