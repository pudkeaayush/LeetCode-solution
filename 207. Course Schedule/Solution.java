/* The main idea here is to find the indegrees of all the nodes. We add all the nodes that have 0 indegree to a queue. Then we start removing
an element at a time from the queue and if it has any outgoing edges, we decrement the indegree count of that node. If at any point any node
has 0 indegrees, that means that all of it's edges have been explored and it can be added to the queue. If at the end we have added numCourses to the queue, then it means all can be completed else not.*/
public class Solution {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Queue < Integer > queue = new LinkedList < Integer >();
        int[] inDegrees = new int[numCourses];
        int count = 0;
        
        for ( int i = 0; i < prerequisites.length; i++) {
            inDegrees[prerequisites[i][0]]++;
        }
        
        for ( int i = 0; i < inDegrees.length; i++) {
            if( inDegrees[i] == 0)    
                queue.offer(i);
        }
        
        while(!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println(element);
            count++;
            for ( int i = 0 ; i < prerequisites.length; i++) {
                if( prerequisites[ i ][ 1 ] == element ) {
                        inDegrees[prerequisites[i][0]]--;
                        if( inDegrees[prerequisites[i][0]] == 0)
                        	queue.offer(prerequisites[i][0]);
                }
            }
        }
     
        if( count == numCourses)
            return true;
        return false;
        
    }
    
    
}
