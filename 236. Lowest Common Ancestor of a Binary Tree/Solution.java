/* The idea is to traverse the tree starting from root. If any of the given keys p and q matches with the root element,
then the root is the LCA. If root doesn't match any of the keys, we recur for the left and right subtrees. The node which
has one key present in the left subtree and one key present in the right subtree is our LCA. If both keys lie in left subtree,
the left subtree will have the LCA, else the right. */

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root == null || root == p || root == q)
          return root;
        TreeNode left = lowestCommonAncestor( root.left , p , q);
        TreeNode right = lowestCommonAncestor( root.right , p , q);
        if( left != null && right != null )
          return root;
        return left != null ? left : right;   
    }
}
