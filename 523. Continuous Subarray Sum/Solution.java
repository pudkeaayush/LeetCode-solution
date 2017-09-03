class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map < Integer , Integer > map = new HashMap < Integer , Integer >();
        map.put( 0 , - 1);
        int sum = 0 , mod = 0;
        for( int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if( sum == 0 && i >= 1) // For [0,0] , 0 case
                return true;
            if( k != 0) {
                mod = sum % k;
                if(map.containsKey(mod)) {
                    if( i - map.get(mod) >= 2)
                        return true;
                } else {
                    map.put(mod , i);
                }
            }
        }
        return false;
    }
}
