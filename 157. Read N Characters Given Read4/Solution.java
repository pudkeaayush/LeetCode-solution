public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        char[] temp = new char[ 4 ];
        int read = 0;
        int total = 0;
        while( true) {
            read = read4(temp);
            int len = Math.min(read , n - total);
            for( int i = 0; i < len; i++)
                buf[ total ++ ] = temp[ i ];
            if( read < 4)
                return total;
            if(total == n)
                return n;
        }
    }
}
