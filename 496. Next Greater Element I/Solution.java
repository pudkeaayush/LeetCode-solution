public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map < Integer , Integer > map = new HashMap < Integer , Integer >();
        Stack < Integer > stack = new Stack < Integer >();
        for (int i = 0; i < nums.length; i++) {
            while( !stack.isEmpty() && stack.peek() < nums[i]) {
                map.put(stack.pop() , nums[i]);
            }
            stack.push(nums[i]);
        }
        int[]  ans = new int[findNums.length];
        for ( int i = 0; i < findNums.length; i++) {
            ans[i] =  map.getOrDefault(findNums[i], -1);
        }
        return ans;
    }
}
