public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int i = 5;
        while ( n > 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
}
