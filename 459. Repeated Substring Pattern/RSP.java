/* The idea here is to iterate from (length of string / 2) till 1 and check if length of string % index divides the whole string.
If so try repeating the substring from index 0 till this current position n number of times where n = (length of string / 2). If this string
equals the original string, then we return true. Else iterate till end and return false. */
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for ( int i = len / 2; i >= 1; i-- ) {
            //System.out.println("i is" + i);
            if ( len % i == 0) {
                String substring = s.substring(0 , i);
                //System.out.println("substring is" + substring);
                int times = len / i;
                StringBuilder temp = new StringBuilder();
                for ( int j = 0; j < times; j++) {
                    temp.append(substring);
                }
                if( temp.toString().equals(s) )
                    return true;
            }
        }
        return false;
    }
}
