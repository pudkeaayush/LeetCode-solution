/* The idea is as follows :
1. From left keep moving the left pointer till you find a vertical bar which is taller than the next bar.
2. From the right keep moving the right pointer till you find a vertical bar which is taller than the bar on the right.
3. Now we will check which among left bar and right bar is the shorter. We keep moving either the left or right
pointer accordingly till we find another bar which is taller than this bar. At each point subtract the difference 
between the height and add it to ans.
4. Terminate when left < right condition is false. */

public class Solution {
    
    public int trap(int[] height) {
        if( height.length <= 2)
            return 0;
        int left_index = 0;
        int right_index = height.length - 1;
        int left_element = height[ left_index ];
        int right_element = height[ right_index ];
        int ans = 0;
        
        while ( left_index < right_index && height[left_index] <= height[left_index + 1] )
            left_index++;
        while ( left_index < right_index && height[right_index] <= height[right_index - 1])
            right_index--;
        //System.out.println(left_index + " " + right_index);    
 
        while( left_index < right_index) {
            left_element = height[ left_index ];
            right_element = height[ right_index ];
            
            if( left_element <= right_element) {
                while(left_index < right_index && left_element >= height[++left_index]) {
                    //System.out.println(left_element - height[ left_index ] + "yo");
                    ans += left_element - height[ left_index ];
                }    
            } else {
                while (right_index > left_index && right_element >= height[--right_index]) {
                    //System.out.println(left_element - height[ right_index ] + "y");
                    ans += right_element - height[ right_index ];
                }
            }
            
        }
        return ans;
    }
}
