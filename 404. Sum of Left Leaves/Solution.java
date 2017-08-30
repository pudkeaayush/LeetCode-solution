class Solution {
    int sum = 0;
    
    public int inorder( TreeNode root , boolean flag) {
        if( root == null)
            return sum;
        inorder(root.left , true);
        if( root.left == null && root.right == null && flag)
            sum += root.val;
        inorder(root.right , false);
        return sum;
            
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        if( root == null)
            return 0;
        Queue < TreeNode > queue = new LinkedList < TreeNode>();
        queue.offer(root);
        int count = 0;
        int sum = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for( int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if(node.left != null && node.left.left == null && node.left.right == null)
                    sum += node.left.val;
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            count++;
        }
        return sum;
        
        //return inorder(root , false);
        
    }
}
