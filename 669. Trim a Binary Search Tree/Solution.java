class Solution {
    
    public TreeNode trimBSTHelper(TreeNode root, int L, int R) {
        if( root == null)
            return root;
         if(root.val < L)
            return trimBSTHelper(root.right, L, R);
        if(root.val > R)
            return trimBSTHelper(root.left , L , R);
        root.left = trimBSTHelper(root.left , L , R);
        root.right = trimBSTHelper(root.right , L , R);
        return root;
    }
    
    public TreeNode trimBST( TreeNode root , int L , int R) {
        return trimBSTHelper(root , L , R);
    }
}
