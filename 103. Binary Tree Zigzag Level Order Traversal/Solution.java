public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        
        if(root == null) 
            return res;
        
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            List < Integer > level = new ArrayList<Integer>();
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                if( count % 2 != 0)
                    level.add(0 , node.val);
                else
                    level.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(level);
            count++;
        }
        return res;
    }
}
