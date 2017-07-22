public class Solution {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;
        
        if(l1 == null)
            return l2;
        if( l2 == null)
            return l1;
        
        while(l1 != null && l2 != null) {
            temp = head;
            if(l1.val <= l2.val) {
                if( head == null) {
                    head = new ListNode(l1.val);
                    temp = head;
                }
                while(temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new ListNode(l1.val);
                //System.out.println(l1.val + "val");
                l1 = l1.next;
            }
            else {
                if( head == null) {
                    head = new ListNode(l2.val);
                    temp = head;
                }
                while(temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new ListNode(l2.val);
                //System.out.println(l2.val);
                l2 = l2.next;
            }
        }
        
        if(l1 != null) {
            temp = head;
            while( temp.next != null)
                temp = temp.next;
            temp.next = l1;
        }
        if(l2 != null) {
            temp = head;
            while( temp.next != null)
                temp = temp.next;
            temp.next = l2;
        }
        
        return head.next;
    }
}
