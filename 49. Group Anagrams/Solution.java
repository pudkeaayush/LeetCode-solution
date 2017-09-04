public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap < String , ArrayList < String > > map = new HashMap < String , ArrayList < String > >();
        List < List < String > > result = new ArrayList < List < String > >();
        for ( int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            if(!map.containsKey(new String(charArray) )) {
                ArrayList < String > temp = new ArrayList < String >();
                temp.add(strs[i]);
                map.put(new String(charArray) , temp);
            }
            else {
                ArrayList < String> temp = map.get(new String(charArray));
                temp.add(strs[i]);
                map.put(new String(charArray) , temp);
            }
        }
        for ( ArrayList l : map.values()) {
            result.add(l);
        }
        return result;
    }
}
