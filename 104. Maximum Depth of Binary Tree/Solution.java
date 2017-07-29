public class Solution {
    public int helper ( TreeNode root) {
        if ( root == null)
            return 0;
        int left = 1 + helper( root.left );
        int right = 1 + helper ( root.right );
        return Math.max ( left , right);
    }
    public int maxDepth(TreeNode root) {
        return helper(root);
    }
}
