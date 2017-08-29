class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List < Interval > result = new ArrayList < Interval >();
        boolean added = false;
        for( Interval i : intervals) {
            if(added || i.end < newInterval.start)
                result.add(i);
            else if(newInterval.end < i.start) {
                result.add(newInterval);
                result.add(i);
                added = true;
            } else {
                newInterval.start = Math.min(i.start , newInterval.start);
                newInterval.end = Math.max(i.end , newInterval.end);
            }
        }
        if(!added)
            result.add(newInterval);
        return result;
        
    }
}
