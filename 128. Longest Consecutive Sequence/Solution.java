public class Solution {
    
    public int longestConsecutive(int[] nums) {
        HashMap < Integer , Integer > map = new HashMap < Integer , Integer >();
        int left = 0, right = 0 , max = 0;
        for ( int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                if(map.containsKey(nums[i] - 1)) {
                    left = map.get(nums[i] - 1);
                }
                else
                    left = 0;
                if(map.containsKey(nums[i] + 1)) {
                    right = map.get(nums[i] + 1);
                } else
                    right = 0;
                max = Math.max ( max , left + right + 1);
                map.put(nums[ i ] , left + right + 1);
                map.put(nums[ i ] - left , left + right + 1);
                map.put(nums[ i ] + right , left + right + 1);
            }
        }
    }
       
}
