public class Solution {
    List < Integer > ans = new ArrayList < Integer >();
    Stack <TreeNode > stack = new Stack <TreeNode>();
    public List<Integer> inorderTraversal(TreeNode root) {
        while( root != null || !stack.isEmpty()) {
            while( root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode cur = stack.pop();
            System.out.println(cur.val);
            ans.add(cur.val);
            root = cur.right;
        }
        return ans;
    }
}
