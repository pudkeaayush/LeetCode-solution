class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        int previousTimeStamp = 0;
        Stack < Integer > stack = new Stack < Integer >();
        for( String l : logs) {
            String[] split = l.split(":");
            if(!stack.isEmpty()) {
                res[stack.peek()] += (Integer.parseInt(split[2]) - previousTimeStamp);
            }
            previousTimeStamp = Integer.parseInt(split[2]);
            if(split[1].equals("start"))
                stack.push(Integer.parseInt(split[0]));
            else {
                res[stack.pop()]++;
                previousTimeStamp++;
            }
        }
        return res;
    }
        
}
