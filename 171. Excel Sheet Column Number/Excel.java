/* Create a mapping of the 26 alphabets from 1 to 26. Iterate the string from the end. At each point get the value of the map corresponding
to the character and add it to the answer. After each iteration, multiply count by 26*/
public class Solution {
    public int titleToNumber(String s) {
        int[] arr = new int[26];
        int ans = 0;
        int count = 1;
        // Create map of alphabets
        for ( int i = 0; i < 26; i++) {
            arr[ i ] = i + 1;
        }
        for ( int j = s.length() - 1; j >= 0; j--) {
            ans += count * arr[ s.charAt(j) - '0' - 17];
            count = count * 26;
        }
        return ans;
    }
}
