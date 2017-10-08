class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] arr = new int[256];
        int count = 0 , index = 0 , result = 0;
        for( int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i)] == 0)
                count++;
            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
            if( count > k) {
                while(arr[s.charAt(index)] > 0) {
                    arr[s.charAt(index)] = arr[s.charAt(index)] - 1;
                    if(arr[s.charAt(index)] == 0) {
                        index++;
                        break;
                    } else
                        index++;
                }
                count--;
            }
            result = Math.max(result , i - index + 1);
        }
        return result;
    }
}
