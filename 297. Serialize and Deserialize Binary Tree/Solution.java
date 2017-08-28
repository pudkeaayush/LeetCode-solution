public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue < TreeNode > queue = new LinkedList < TreeNode >();
        if(root == null) {
            return "";
        }
        int count = 0;
        queue.offer(root);
        StringBuilder str = new StringBuilder();
        while( !queue.isEmpty() ) {
            int len = queue.size();
            for ( int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                if(temp == null) {
                    str.append(" " + "X");
                    continue;
                }
                if( count == 0 ) {
                    str.append(Integer.toString(temp.val));
                    count++;
                }
                else
                    str.append(" " + Integer.toString(temp.val));
                if(temp.left != null)
                    queue.offer(temp.left);
                else
                    queue.offer(null);
                if( temp.right != null)
                    queue.offer(temp.right);
                else
                    queue.offer(null);
            }
        }
        System.out.println(str.toString());
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] numbers = data.split(" ");
        Queue < TreeNode > queue = new LinkedList < TreeNode >();
        if(data.length() == 0)
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(numbers[0]));
        queue.offer(root);
        for ( int i = 1; i < numbers.length; i++) {
            TreeNode temp = queue.poll();
            if(!numbers[i].equals("X")) {
                temp.left = new TreeNode(Integer.parseInt(numbers[i]));
                queue.offer(temp.left);
            }
            if(i < numbers.length - 1 && !numbers[++i].equals("X")) {
                temp.right = new TreeNode(Integer.parseInt(numbers[i]));
                queue.offer(temp.right);
            }
        }
        return root;
    }
}
