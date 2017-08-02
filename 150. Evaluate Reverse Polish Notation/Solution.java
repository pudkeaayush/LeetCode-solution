public class Solution {
    public int evalRPN(String[] tokens) {
        Stack < Integer > stack = new Stack < Integer >();
        for( int i = 0; i < tokens.length; i++) {
            try{
                stack.push(Integer.parseInt(tokens[i]));
            }
            catch( NumberFormatException ex) {
                int count = 0;
                int a = 1, b = 1;
                while(!stack.isEmpty() && count < 2) {
                    b = stack.pop();
                    if(!stack.isEmpty())
                       a = stack.pop();
                    else
                        return -1;
                    count = 2;
                }
                if(tokens[i].equals("/")) {
                    stack.push(a / b);
                }
                else if( tokens[i].equals("*")) {
                    stack.push( a * b);
                }
                else if( tokens[i].equals("+")) {
                    stack.push( a + b);
                }
                else if( tokens[i].equals("-")) {
                    stack.push( a - b);
                }
                else
                    return -1;
            }
            
        }
        return stack.pop();
    }
}
