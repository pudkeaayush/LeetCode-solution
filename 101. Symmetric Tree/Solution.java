public class Solution {
    public boolean isRoot( TreeNode root1 , TreeNode root2) {
        if( root1 == null && root2 == null)
            return true;
        if( root1 == null || root2 == null)
            return false;
        return (root1.val == root2.val) && isRoot(root1.right,root2.left) && isRoot(root1.left , root2.right) ;
    }
    
    public boolean isSymmetric(TreeNode root) {
        return isRoot( root , root);
    }
}
