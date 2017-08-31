public class Solution {
    public String frequencySort(String s) {
        Map < Character , Integer > map = new HashMap < Character , Integer >();
        int max = 0;
        for ( int i = 0; i < s.length(); i++ ) {
            if( !map.containsKey(s.charAt(i)))
                map.put(s.charAt(i) , 1);
            else
                map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
            max = Math.max(max , map.get(s.charAt(i)));
        }
        
        List < Character>[] array = new List[ max + 1];
        for ( Character c : map.keySet() ) {
            int count = map.get(c);
            if( array[count] == null)
                array[count] = new ArrayList();
            array[count].add(c);
        }
        
        StringBuilder ans = new StringBuilder();
        for ( int i = array.length - 1; i >= 0; i--) {
            if(array[i] != null) {
                List< Character > arr = array[i];
                for (Character c : arr)
                    for( int j = 0; j < i; j++)
                        ans.append(c);
            }
        }
        return ans.toString();
    }
}
