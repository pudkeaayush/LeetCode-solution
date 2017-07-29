public class Solution {
    public boolean isValidBST1 ( TreeNode root , long minVal , long maxVal) {
        if( root == null)
            return true;
        if( root.val <= minVal || root.val >= maxVal)
            return false;
        return isValidBST1( root.left , minVal , root.val) && isValidBST1( root.right , root.val , maxVal );
        
    }
    
    public boolean isValidBST(TreeNode root) {
        return isValidBST1(root , Long.MIN_VALUE , Long.MAX_VALUE);
    }
}
