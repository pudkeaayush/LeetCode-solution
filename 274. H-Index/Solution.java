class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] bucket = new int[len + 1];
        int count = 0;
        for( Integer i : citations) {
            if(i >= len)
                bucket[len]++;
            else
                bucket[i]++;
        }
        for( int j = len; j >= 0; j--) {
            count += bucket[ j ];
            if(count >= j)
                return j;
        }
        return 0;
    }
}
