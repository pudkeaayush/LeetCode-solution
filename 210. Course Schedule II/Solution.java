/* The main idea here is to find the indegrees of all the nodes. We add all the nodes that have 0 indegree to a queue. Then we start removing
an element at a time from the queue and if it has any outgoing edges, we decrement the indegree count of that node. If at any point any node
has 0 indegrees, that means that all of it's edges have been explored and it can be added to the queue and our final answer. If at the end we have added numCourses 
to the count of elements removed from the queue, then it means all can be completed else not.*/

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        int[] ans = new int[numCourses];
        int count = 0;
        Queue < Integer > queue = new LinkedList <Integer>();
        for ( int i = 0; i < prerequisites.length; i++) {
            indegrees[prerequisites[i][0]]++;
        }
        for ( int i = 0; i < indegrees.length; i++) {
            if( indegrees[ i ] == 0)
                queue.offer(i);
        }
        while( !queue.isEmpty() ) {
            int element = queue.poll();
            ans[ count ] = element;
            if( count == numCourses - 1)
                break;
            for( int i = 0; i < prerequisites.length; i++) {
                if( prerequisites[i][1] == element) {
                    indegrees[ prerequisites[ i ][ 0 ]]--;
                	if( indegrees[ prerequisites[i][0]] == 0)
                    	queue.offer(prerequisites[i][0]);
                }
            }
            count++;
            
        }
        if( count == numCourses - 1)
            return ans;
        else
            return new int[]{};
        
    }
}
