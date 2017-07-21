public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
        slow.next = head;
        
        for( int i = 0; i <=n; i++) {
            fast = fast.next;
        }
        while( fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        head = dummy.next;
        return head;
    }
}
