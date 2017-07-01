public class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> stack = new Stack <Integer>();
        int area = 0;
        if(heights.length == 0)
            return 0;
        stack.push(0);
        int top , i;
        int element;
        for (  i = 1; i < heights.length; i++) {
              if(heights[i] >= heights[stack.peek()])
                    stack.push(i);
                else
                {
                    while ( !stack.isEmpty() && heights[stack.peek()] > heights[i] ) {
                        top = stack.pop();
                        if(stack.isEmpty())
                            area = Math.max(area , heights[top] * i );
                        else
                            area = Math.max(area , heights[top] * (i - stack.peek() - 1));
                    }
                    stack.push(i);
                }
        }
        //System.out.println("value of i is" + i);
        while(!stack.isEmpty()) {
            element = stack.pop();
            if(!stack.isEmpty())
                area = Math.max( area , heights[element] * ( i - stack.peek() - 1));
            else
                area = Math.max( area , heights[element] * i);
            //System.out.println(area);
        }
        return area;
    }
}
