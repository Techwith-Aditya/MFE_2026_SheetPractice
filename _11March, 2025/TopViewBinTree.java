class Pair {
    Node node;
    int line;
    Pair(int line, Node node) {
        this.node=node;
        this.line=line;
    }
}


class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> a=new ArrayList<>();
        if(root==null)
        {
            return a;
        }
        TreeMap<Integer, Integer> map=new TreeMap<>(); // stores (line no, Node's value)...root ki line 0 and usse left -1 fir -2...aur root k right me +1, fir +2...
        Queue<Pair> q=new LinkedList<>(); // stores (line no, node (not data))...
        
        q.add(new Pair(0, root));
        while(!q.isEmpty())
        {
            // get topmost node and it's line no...
            Pair top=q.remove(); // hold top pair (_,_)...
            int line=top.line;
            Node temp=top.node;
            
            if(map.get(line)==null)
            {
                map.put(line, temp.data);
            }
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
