public class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] arr = new boolean[s.length() + 1][p.length() + 1];
        char[] pattern = p.toCharArray();
        char[] text = s.toCharArray();
        arr[ 0 ][ 0 ] = true;
        for( int i = 2; i < arr[0].length; i++)
            if(pattern[i - 1] == '*')
                arr[ 0 ][ i ] = arr[ 0 ][ i - 2];
        
        for( int i = 1; i < arr.length; i++) {
            for( int j = 1; j < arr[0].length; j++) {
                if(pattern[j - 1] == '.' || pattern[ j - 1] == text[ i - 1])
                    arr[ i ][ j ] = arr[ i - 1][ j - 1];
                else if( pattern[j - 1] == '*') {
                    arr[ i ][ j ] = arr[ i ][ j - 2];
                    if(pattern[ j - 2] == text[ i - 1] || pattern[ j - 2] == '.' )
                        arr[ i ][ j ] = arr[ i ][ j ] | arr[ i - 1][ j ] ;
                } else
                    arr[ i ][ j ] = false;
            }
        }
        return arr[s.length()][p.length()];
    }
}
