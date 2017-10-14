class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List < String > result = new ArrayList < String >();
        HashMap < String , Integer > map = new HashMap < String , Integer >();
        for( int i = 0; i < words.length; i++) {
            if(map.containsKey(words[i]))
                map.put(words[i] , map.get(words[i]) + 1);
            else
                map.put(words[i] , 1);
        }
        
        PriorityQueue < Map.Entry < String , Integer > > pq = 
            new PriorityQueue < Map.Entry < String , Integer > >(new Comparator< Map.Entry< String , Integer > >() {
            public int compare ( Map.Entry< String , Integer > k1 , Map.Entry < String , Integer > k2 ) {
                if(k1.getValue() < k2.getValue())
                    return 1;
                else if( k1.getValue() > k2.getValue())
                    return -1;
                else {
                    if( k1.getKey().compareTo(k2.getKey()) < 0 )
                        return -1;
                    else
                        return 1;
                }
            }
        });
        
        for( Map.Entry< String, Integer > m: map.entrySet()) {
            pq.offer(m);
        }
        int count = 0;
        while( count < k) {
            result.add(pq.poll().getKey());
            count++;
        }
        return result;
    }
}
