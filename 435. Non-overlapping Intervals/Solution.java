public class Solution {
    
    class myComparator implements Comparator< Interval >  {
        public int compare ( Interval a , Interval b) {
            return a.end - b.end;
        }
    }
    
    public int eraseOverlapIntervals(Interval[] intervals) {
        if( intervals.length == 0)
            return 0;
        Arrays.sort(intervals , new myComparator());
        int begin = intervals[0].start;
        int ending = intervals[0].end;
        int count = 0;
        for ( int i = 1; i < intervals.length; i++ ) {
            if( intervals[i].start < ending )
                count++;
            else
                ending = intervals[i].end;
        }
        return count;
    }
}
