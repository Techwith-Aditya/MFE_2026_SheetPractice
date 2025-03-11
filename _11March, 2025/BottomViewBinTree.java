class Pair {
    int line;
    Node node;
    Pair(int line, Node node) {
        this.line=line;
        this.node=node;
    }
}
class Solution {
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root) {
        ArrayList<Integer> a=new ArrayList<>();
        TreeMap<Integer, Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        
        if(root==null)
        {
            return a;
        }
        q.add(new Pair(0, root));
        while(!q.isEmpty())
        {
            Pair top=q.remove();
            int line=top.line;
            Node temp=top.node;
            
            // this was in top view approach, that us line ka jo bhi phla mil gya, use put kr do map me:
            // if(map.get(line)==null)
            // {
            //     map.put(line, temp.data);
            // }
            
            // but here in bottom view, us line pe aage jo bhi hme milega vo pichle wale se neeche hoga to that will contribute more to bottom view approach... 
            map.put(line, temp.data);
            
            if(temp.left!=null)
            {
                q.add(new Pair(line-1, temp.left));
            }
            if(temp.right!=null)
            {
                q.add(new Pair(line+1, temp.right));
            }
        }
        for(Map.Entry<Integer, Integer> pair : map.entrySet())
        {
            a.add(pair.getValue());
        }
        return a;
    }
}
