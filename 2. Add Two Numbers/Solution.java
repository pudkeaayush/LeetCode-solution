public class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode end = null;
        int carry = 0;
        ListNode sumList = null;
        int sum = 0;
        
        while( l1 != null || l2 != null) {
            sum = 0;
            if( l1 != null && l2 != null)
                sum = l1.val + l2.val + carry;
            else if( l1 != null && l2 == null)
                sum = l1.val + carry;
            else if( l1 == null && l2 != null)
                sum = l2.val + carry;
            sumList = new ListNode( sum % 10 );
            carry = sum / 10;
            if( head == null ) {
                head = sumList;
                end = sumList;
            }
            else {
                end.next = sumList;
                end = sumList;
            }
            if(l1 != null)
                l1 = l1.next;
            if( l2 != null)
                l2 = l2.next;
        }
        
        if(carry != 0) {
            end.next = new ListNode(carry);
        }
        
        return head;
    }
}
