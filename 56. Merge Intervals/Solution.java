public class Solution {
    public class myComparator implements Comparator < Interval > {
        public int compare(Interval interval1 , Interval interval2) {
            return interval1.start - interval2.start;
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        if( intervals.size() <= 1)
            return intervals;
        Collections.sort ( intervals , new myComparator() );
        List < Interval > ans = new ArrayList < Interval >();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval interval : intervals) {
        if (interval.start <= end) // Overlapping intervals, move the end if needed
            end = Math.max(end, interval.end);
        else {                     // Disjoint intervals, add the previous one and reset bounds
            //System.out.println("Adding");
            ans.add(new Interval(start, end));
            start = interval.start;
            end = interval.end;
        }
    }
    
    // Add the last interval
    ans.add(new Interval(start, end));
    return ans;
        
    }
}
