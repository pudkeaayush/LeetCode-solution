public class Solution {
    public int distributeCandies(int[] candies) {
        Set < Integer > set = new HashSet < Integer > ();
        for ( int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }
        return Math.min( set.size() , candies.length / 2);
    }
}
