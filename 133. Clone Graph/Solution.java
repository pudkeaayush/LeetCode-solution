public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        
        if(node == null)
            return null;
        
        HashMap < UndirectedGraphNode , UndirectedGraphNode > map = new HashMap <>();   // Original , Cloned
        Queue < UndirectedGraphNode > queue = new LinkedList < UndirectedGraphNode >(); // Original
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        queue.add(node);
        map.put(node , clone);
        
        while(!queue.isEmpty()) {
            UndirectedGraphNode temp = queue.poll();    // Original
            for ( UndirectedGraphNode neighbors : temp.neighbors) {
                if(map.containsKey(neighbors))
                    map.get(temp).neighbors.add(map.get(neighbors));
                else {
                    UndirectedGraphNode neigh = new UndirectedGraphNode(neighbors.label);
                    map.put(neighbors , neigh); // Original , Cloned
                    map.get(temp).neighbors.add(neigh); // Orignal , Cloned
                    queue.add(neighbors); // Original
                }
            }
        }
        return clone;
        
    }
}
