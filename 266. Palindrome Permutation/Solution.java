class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] arr = new int[256];
        char[] charArray = s.toCharArray();
        for( int i = 0; i < charArray.length; i++) {
            arr[charArray[i]] += 1;
        }
        boolean flag = false;
        for( int i = 0; i < 256; i++) {
            if( flag == true && arr[i] % 2 != 0)
                return false;
            if(arr[i] % 2 != 0)
                flag = true;
        }
        return true;
    }
}
