public class Solution {
    public int leastBricks(List < List < Integer >> wall) {
        HashMap < Integer , Integer > map = new HashMap < Integer , Integer >();
        int sum = 0;
        for(List l : wall) {
            sum = 0;
            for( int i = 0; i < l.size() - 1; i++) {
                sum += (int)l.get(i);
                if(map.containsKey(sum))
                    map.put(sum , map.get(sum) + 1);
                else
                    map.put(sum , 1);
            }
        }
        int result = wall.size();
        for( int key : map.keySet())
            result = Math.min(result , wall.size() - map.get(key));
        return result;
    }
}
