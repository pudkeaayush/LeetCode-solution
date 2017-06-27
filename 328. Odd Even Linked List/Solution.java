/* The basic idea is that we should make the odd nodes link to each other and the even nodes link to each other. At the end 
we make the next of odd to point to the head of the even nodes. */

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if( head == null)
            return null;
            
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even;
        
        while( even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }
}
