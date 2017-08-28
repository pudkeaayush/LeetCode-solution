class Solution {
    public void helper( TreeNode root , List < String > result , StringBuilder sb) {
        if(root == null)
            return;
        int len = sb.length();
        sb.append(root.val);
        if( root.left == null && root.right == null)
            result.add(sb.toString());
        else {
            sb.append("->");
            helper(root.left , result , sb);
            helper( root.right , result , sb);
        }
        sb.setLength(len);
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List < String > result = new ArrayList < String >();
        helper(root , result , new StringBuilder());
        return result;
    }
}
