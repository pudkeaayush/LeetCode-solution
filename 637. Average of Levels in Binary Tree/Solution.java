class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List < Double > result = new ArrayList < Double >();
        if(root == null)
            return result;
        Queue < TreeNode > queue = new LinkedList < TreeNode >();
        queue.offer(root);
        while( !queue.isEmpty()) {
            int len = queue.size();
            double sum = 0;
            for( int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            double ans = sum / len;
            result.add(ans);
        }
        return result;
    }
}
