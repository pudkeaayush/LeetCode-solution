// The logic is simply to create a hashmap first and check if the hashmap contains the key having value "x" and "x + 1".
The result would then simply be the max of the key values in map having key element "x" and "x + 1".
public class Solution {
    public int findLHS(int[] nums) {
        HashMap < Integer , Integer > map = new HashMap < Integer , Integer>();
        for ( int i = 0; i < nums.length; i++) {
            if( map.containsKey(nums[i]) )
                map.put( nums[i] , map.get(nums[i]) + 1);
            else
                map.put( nums[i] , 1);
        }
        int result = 0;
        for ( Map.Entry< Integer , Integer > entry : map.entrySet() ) {
            if( map.containsKey(entry.getKey() ) && map.containsKey( entry.getKey() + 1) ) {
                result = Math.max( result , map.get(entry.getKey() ) + map.get( entry.getKey() + 1) );
            }
        }
        return result;
    }
}
