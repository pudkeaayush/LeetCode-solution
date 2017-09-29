class Solution {
    public int longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int res = 0;
        boolean odd = false;
        int[] uppercase = new int[26];
        int[] lowercase = new int[26];
        for( int i = 0; i < arr.length; i++) {
            if(arr[i] > 96)
                lowercase[arr[i] - 'a']++;
            else
                uppercase[arr[i] - 'A']++;
        }
        for( int i = 0; i < 26; i++) {
            if(lowercase[i] % 2 == 0)
                res += lowercase[i];
            else {
                odd = true;
                res += lowercase[i] - 1;
            }
            if(uppercase[i] % 2 == 0)
                res += uppercase[i];
            else {
                odd = true;
                res += uppercase[i] - 1;
            }
        }
        if(odd)
            return res + 1;
        else
            return res;
    }
}
