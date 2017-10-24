class Solution {
    HashMap < Integer , Integer > map = new HashMap < Integer , Integer >();
    public int getSum( TreeNode  root) {
        if( root == null )
            return 0;
        int total = root.val + getSum(root.left) + getSum(root.right);
        if(map.containsKey(total))
            map.put(total , map.get(total) + 1);
        else
            map.put(total , 1);
        return total;
    }
    public boolean checkEqualTree(TreeNode root) {
        int sum = getSum(root);
        if(sum == 0)
            if(map.containsKey(sum))
                return map.get(sum) > 1;
            else
                return false;
        return sum % 2 == 0 && map.containsKey(sum/2);
    }
}
