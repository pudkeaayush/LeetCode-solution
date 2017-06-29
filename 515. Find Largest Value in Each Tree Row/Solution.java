/*The main idea here is to do a level order traversal and at each level, find the maximum element in that level and add it to the 
resultant array. All the nodes in a particular level can be found out by considering the size of the queue at that time.*/

public class Solution {
    
    public List<Integer> levelOrder( TreeNode root , int height) {
        if( root == null)
            return new ArrayList <Integer >();
        
        Queue < TreeNode > queue = new LinkedList < TreeNode >();
        ArrayList < Integer > arr = new ArrayList <Integer>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for ( int i = 0; i < size; i++ ) {
                TreeNode temp = queue.poll();
                if( temp.left != null)
                    queue.offer(temp.left);
                if( temp.right != null)
                    queue.offer(temp.right);
                if( temp.val > max)
                    max = temp.val;
            }
            //System.out.println(max);
            arr.add(max);
        }
        return arr;
        
    }
    
    public List<Integer> largestValues(TreeNode root) {
        return levelOrder( root , 0); 
    }
}
