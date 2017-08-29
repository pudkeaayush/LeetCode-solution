class Solution {
    public String simplifyPath(String path) {
        Stack < String> stack = new Stack < String >();
        String[] arr = {"." , "",".."};
        String[] splitStr = path.split("/");
        for( int i = 0; i < splitStr.length; i++) {
            if( splitStr[i].equals(arr[2]) ) {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else if(splitStr[i].equals(arr[0]) || splitStr[i].equals(arr[1])) {
                continue;
            } else
                stack.push(splitStr[i]);
                
        }
        String result = "";
        for( String s : stack) {
            result = result + "/" + s;
        }
        return result.equals("") ? "/" : result;
    }
}
