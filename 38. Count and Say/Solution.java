public class Solution {
    public String countandSay( int n) {
        if( n <= 0)
            return "";
        if( n == 1)
            return "1";
        String temp = "11";
        int count = 1;
        for( int i = 2; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for ( int j = 0; j < temp.length() ; j++) {
                char c = temp.charAt(j);
                while(j + 1 < temp.length() && c == temp.charAt(j + 1)) {
                    j++;
                    count++;
                }
                str.append(count);
                str.append(c);
                count = 1;
            }
            if( i == 1)
                temp = "1";
            else
                temp = str.toString();
        }
        return temp;
    }
    
    public String countAndSay(int n) {
        return countandSay(n);
    }
}
