/* Idea taken from the most upvoted code for this problem in leetcode */
public class Solution {
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if ( root == null)
            return;
        flatten( root.right );
        flatten( root.left );
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
