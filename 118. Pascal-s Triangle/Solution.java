public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return ans;
        else{
            for( int i = 0; i < numRows; i++) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(1);
                if(i > 1) {
                    List<Integer> temp = ans.get(i - 1);
                    int count = 0;
                    int sum = 0;
                    while( count < temp.size() - 1) {
                        //System.out.println("Hi" + temp.get(count));
                        sum = temp.get(count) + temp.get(count + 1);
                        list.add(sum);
                        count++;
                    }
                    list.add(1);
                }
                if( i == 1)
                    list.add(1);
                ans.add(list);
            }
        }
        return ans;
        
    }
}
