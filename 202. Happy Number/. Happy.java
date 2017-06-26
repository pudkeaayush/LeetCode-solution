/* Just as shown in the example, we keep on adding the result of the square of individual digits to a set. We keep 
doing this till it equals to 1 in which case we return true else if the set contains the new calculated sum already, 
it would end in a loop and thus we return false*/

public class Solution {
    public boolean isHappy(int n) {
        Set < Integer > set = new HashSet < Integer >();
        int sum = 0;
        while ( n != 1) {
            sum = 0;
            while ( n > 0) {
                sum += Math.pow( n % 10 , 2);
                n = n / 10;
            }
            System.out.println(sum);
            if( set.contains(sum) )
                return false;
            set.add(sum);
            n = sum;
        }
        return true;
    }
}
