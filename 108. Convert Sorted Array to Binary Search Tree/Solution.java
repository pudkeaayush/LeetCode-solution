public class Solution {
    
    public TreeNode sortedArray( int[] nums , int start , int end) {
        if( start > end)
            return null;
        int mid = 1;
        mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArray(nums , start , mid - 1);
        node.right = sortedArray( nums , mid + 1 , end);
        return node;
    }
    
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = sortedArray(num, 0, num.length - 1);
        return head;
    }
    
}
