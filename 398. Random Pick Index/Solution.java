class Solution {
    int len;
    int[] num;
    
    public Solution(int[] nums) {
        len = nums.length;
        num = nums; 
    }
    
    public int pick(int target) {
        int count = 0 , index = -1;
        for( int i = 0; i < len; i++) {
            if(num[i] == target && Math.random() * (++count) < 1)
                index = i;
        }
        return index;
    }
}
