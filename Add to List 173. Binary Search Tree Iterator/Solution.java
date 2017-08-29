public class BSTIterator {
    Stack < TreeNode > stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack < TreeNode >();
        TreeNode node = root;
        while(node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (!stack.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode current = stack.pop();
        TreeNode rightNode = current.right;
        while( rightNode != null) {
            stack.push(rightNode);
            rightNode = rightNode.left;
        }
        return current.val;
    }
}
