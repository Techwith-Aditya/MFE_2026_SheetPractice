import java.util.*;
public class BipertiteGraph {
    public static boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        for(int i=0; i<graph.length; i++)
        {
            color[i]=-1;
        }
        
        for(int i=0; i<graph.length; i++)
        {
            if(color[i]==-1)
            {
                if(check(i, graph, color)==false)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean check(int start, int[][] graph, int[] color) {
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        color[start]=0;

        while(!q.isEmpty())
        {
            int node=q.peek();
            q.remove();

            for(int item:graph[node])
            {
                if(color[item]==-1)
                {
                    if(color[node]==0)
                    {
                        color[item]=1;
                    }
                    else
                    {
                        color[item]=0;
                    }
                    q.add(item);
                }
                else if(color[item]==color[node])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] givenGrid={
            {1,3},
            {0,2},
            {1,3},
            {0,2}
        };
        boolean ans=isBipartite(givenGrid);
        System.out.println(ans);
    }
}
