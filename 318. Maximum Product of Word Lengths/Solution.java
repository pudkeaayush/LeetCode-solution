public class Solution {
    public int maxProduct(String[] words) {
        int val = 0;
        int[] bytes = new int[ words.length ];
        for ( int i = 0; i < words.length; i++) {
            for ( int j = 0; j < words[i].length(); j++) {
                val |= 1 << words[i].charAt(j) - 'a';
            }
            bytes[ i ] = val;
            val = 0;
        }
        int max = 0;
        for ( int i = 0; i < words.length; i++) {
            for ( int j = i + 1; j < words.length; j++) {
                if ( (bytes[i] & bytes[j]) == 0) {
                    max = Math.max ( max , words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}
