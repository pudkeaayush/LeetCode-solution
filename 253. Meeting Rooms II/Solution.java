class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals.length == 0 || intervals.length == 1)
            return intervals.length;
        Arrays.sort(intervals , new Comparator< Interval >() {
            public int compare(Interval i1 , Interval i2) {
                if(i1.start < i2.start)
                    return -1;
                else if( i1.start > i2.start)
                    return 1;
                else {
                        return 0;
                }
            }
        });
        int count = 0;
        PriorityQueue < Integer > pq = new PriorityQueue < Integer >();
        pq.add(intervals[0].end);
        for( int i = 1; i < intervals.length; i++) {
            if(intervals[i].start >= pq.peek())
                pq.remove();
            pq.offer(intervals[i].end);
        }
        return pq.size();
    }
}
