class Solution {
    public boolean canAttendMeetings(Interval[] intervals) {
        if(intervals.length <= 1)
            return true;
        Arrays.sort(intervals, new Comparator <Interval>() {
            public int compare( Interval i1 , Interval i2) {
                if(i1.start < i2.start)
                    return -1;
                else if(i1.start == i2.start)
                    return 0;
                else
                    return 1;
            }
        });
        if(intervals.length == 2) {
            if(intervals[0].end > intervals[1].start)
                return false;
            else
                return true;
        }
        int i = 0;
        for( i = 0; i < intervals.length - 1; i++) {
            if(intervals[i].end > intervals[i + 1].start)
                return false;
        }
        return true;
    }
}
