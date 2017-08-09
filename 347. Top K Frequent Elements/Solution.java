public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap < Integer , Integer > map = new HashMap < Integer , Integer >();
        List < Integer > ans = new ArrayList < Integer >();
        int max = 0;
        for ( int i = 0; i < nums.length; i++) {
           if( ! map.containsKey(nums[i]) )
                map.put(nums[i] , 1);
            else
                map.put(nums[i] , map.get(nums[i]) + 1);
            max = Math.max( max , map.get(nums[i]) );
        }
        
        List < Integer >[] array = new List[ max + 1];
        for ( Integer i : map.keySet() ) {
                if( array[map.get(i)] == null)
                    array[map.get(i)] = new ArrayList();
                array[map.get(i)].add(i);
        }
        int count = 0;
        for ( int i = array.length - 1; i >= 0; i-- ) {
            if( array[i] != null)  {
                for( Integer j : array[i]) {
                    ans.add(j);
                    count++;
                    if( count == k)
                        break;
                }
            }
            if( count == k)
                break;
        }
        
        return ans;        
    }
}
