// Agr kisi bhi Path me cycle nhi bn rhi hai toh us path k sare nodes safe nodes hoge...
// Anyone who is a part of cycle cannot be a safe node...
// Anyone which leads to a cycle like whose outgoing edge goes towards the cycle cannot be a safe node...
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] vis=new int[graph.length];
        int[] pathVis=new int[graph.length];
        int[] check=new int[graph.length]; // Jo safe nodes h, unko mark krne k liye...
        
        for(int i=0; i<graph.length; i++)
        {
            if(vis[i]==0)
            {
                dfsCheck(i, graph, vis, pathVis, check);
            }
        }
        
        List<Integer> safe=new ArrayList<>();
        for(int i=0; i<graph.length; i++)
        {
            if(check[i]==1)
            {
                safe.add(i);
            }
        }
        return safe;
    }

    boolean dfsCheck(int node, int[][] graph, int[] vis, int[] pathVis, int[] check) {
        vis[node]=1;
        pathVis[node]=1;
        check[node]=0;
        
        for(int i:graph[node])
        {
            if(vis[i]==0)
            {
                if(dfsCheck(i, graph, vis, pathVis, check)==true)
                {
                    return true;
                }
                
            }
            
            // means this neighbour has been visited in path, so we found cycle
            else if(pathVis[i]==1)
            {
                return true;
            }
            
        }
        check[node]=1;
        pathVis[node]=0;
        return false;
    }
}
