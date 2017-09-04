public class Solution {
    public int minSubArrayLen(int s, int[] a) {
        
        if (a == null || a.length == 0)
            return 0;
  
        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE , sum_so_far = 0;
        
        while ( true ) {
            while ( sum_so_far < s && j <= a.length - 1) {
                sum_so_far += a[j];
                j++;
            }
            while ( sum_so_far >= s) {
                min = Math.min( min , j - i);
                //System.out.println(sum_so_far + " " + a[i]);
                sum_so_far -= a[i];
                if( i + 1 < a.length)
                    i++;
                else
                    break;
            }
            if( j >= a.length ) {
               // min = Math.min( min , j - i + 1);
                break;
            }
        }
        return min < Integer.MAX_VALUE ? min : 0;
    }
  
}
