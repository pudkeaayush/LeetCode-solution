class Solution {
    List < Integer > results = new ArrayList < Integer >();
    
    public void leftNodes( TreeNode root) {
        if( root == null || ( root.left == null && root.right == null ))
            return;
        results.add(root.val);
        if(root.left != null)
            leftNodes(root.left);
        else
            leftNodes(root.right);
    }
    
    public void rightNodes( TreeNode root) {
        if( root == null || (root.left == null && root.right == null ) )
            return;
        if(root.right != null)
            rightNodes(root.right);
        else
            rightNodes(root.left);
        results.add(root.val);
    }
    
    public void leaves( TreeNode root) {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            results.add(root.val);
        leaves(root.left);
        leaves(root.right);
    }
    
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if(root == null)
            return results;
        results.add(root.val);
        leftNodes(root.left);
        leaves(root.left);
        leaves(root.right);
        rightNodes(root.right);
        return results;
    }
}
