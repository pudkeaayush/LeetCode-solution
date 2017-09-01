public class Solution {
    public boolean isPerfectSquare(int num) {
        if( num <= 1)
            return true;
        int a = 1;
        while ( num >= a) {
            num -= a;
            a = a + 2;
        }
        if( num == 0 )
            return true;
        else
            return false;
    }
}
