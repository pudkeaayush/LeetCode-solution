/* The basic idea is to iterate the nodes levelwise. At each level we iterate till the next element is not null. At each step we make the 
left child point to the right child of the parent, and the right child point to either null if the next of parent is null or else to the
left child of the next element of parent.*/

public class Solution {
    
    public void connect(TreeLinkNode root) {
        if( root == null)
            return;
        TreeLinkNode currentLevel = root;
        TreeLinkNode nextLevel = null;
        TreeLinkNode current = root;
        root.next = null;
        
        while( currentLevel.left != null ) {
            nextLevel = currentLevel.left;
            current = currentLevel; 
            while ( current != null) {
                current.left.next = current.right;
                if(current.next != null)
                    current.right.next = current.next.left;
                else
                    current.right.next = null;
                current = current.next;
            }
            currentLevel = nextLevel;
        }
        
    }
}
