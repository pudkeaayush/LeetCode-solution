public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;
        PriorityQueue < ListNode > pq = new PriorityQueue < ListNode >(new Comparator<ListNode>() {
            public int compare( ListNode l1 , ListNode l2) {
                if(l1.val < l2.val)
                    return -1;
                else if( l1.val == l2.val)
                    return 0;
                else
                    return 1;
            }
        });
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for( ListNode l : lists) {
            if(l != null)
                pq.add(l);
        }
        while( pq.size() > 0) {
            temp.next = pq.poll();
            temp = temp.next;
            if( temp.next != null)
                pq.add(temp.next);
        }
        return head.next;
    }
}
