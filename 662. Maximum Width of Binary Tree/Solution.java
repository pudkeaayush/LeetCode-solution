class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        if( root.left == null && root.right == null)
            return 1;
        Queue < TreeNode > queueNodes = new LinkedList < TreeNode >();
        Queue < Integer > queueNodeCount = new LinkedList < Integer >();
        queueNodes.offer(root);
        queueNodeCount.offer(0);
        int max = 1;
        int left = 0 , right = 0;
        while(!queueNodes.isEmpty()) {
            int len = queueNodes.size();
            left = 0;
            right = 0;
            for(int i = 0; i < len; i++) {
                TreeNode node = queueNodes.poll();
                int count = queueNodeCount.poll();
                if ( i == 0 )
                    left = count;
                if( i == len - 1 )
                    right = count;
                if(node.left != null) {
                    queueNodes.offer(node.left);
                    queueNodeCount.offer(2 * count + 1);
                }
                if( node.right != null) {
                    queueNodes.offer(node.right);
                    queueNodeCount.offer(2 * count  + 2);
                }
            }
            max = Math.max(max , right - left + 1);
        }
        return max;
        
    }
}
