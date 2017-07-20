public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0 , index = 0;
        int result = Integer.MIN_VALUE;
        Set < Character > set = new HashSet < Character >();
        
         while (i < s.length() && index < s.length()) {
            if (!set.contains(s.charAt(index))){
                set.add(s.charAt(index));
                result = Math.max(result, index - i + 1);
                index++;
            }
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        
        return result != Integer.MIN_VALUE ? result : 0;
    }
}
