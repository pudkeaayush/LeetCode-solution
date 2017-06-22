// The logic is to simply let i iterate from 1 to the square root of the number and check if that number mode i is equals to 0. If so , we check
if the divisors are different. If so add both to the result else add only single to the resultant array. At the end compute sum of all
elements in the array. If this equals n, the return true else return false.

public class Solution {
    public boolean checkPerfectNumber(int num) {
        int n = num;
        Set < Integer > ans = new HashSet < Integer> ();
        if( num == 1)
            return false;
        for (int i=1; i<=Math.sqrt(n)+1; i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i)
                    ans.add(i);
 
                else {// Otherwise print both
                    ans.add(i);
                    if( (n / i) != n)
                        ans.add( n / i );
                }
            }
        }
        int sum = 0;
        for ( Integer i : ans) {
            System.out.println(i);
            sum = sum + i;
        }
        if( sum == n)
            return true;
        else
            return false;
    }
}
