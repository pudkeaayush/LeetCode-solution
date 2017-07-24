public class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() == 0)
            return 0;
        int count = 0;
        for ( int i = 0; i < haystack.length() - needle.length() + 1; i++) {
                int temp = i;
                while(count < needle.length() && i < haystack.length() && haystack.charAt(i) == needle.charAt(count)) {
                    count++;
                    i++;
                }
                //System.out.println("Count is " + count);
                if( count == needle.length())
                    return temp;
                count = 0;
            i = temp;
        }
        return -1;
    }
}
