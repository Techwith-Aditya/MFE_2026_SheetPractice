class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<List<Integer>> a=new LinkedList<List<Integer>>();
        
        if(root==null) 
        {
            return a;
        }

        q.offer(root);
        while(!q.isEmpty()) 
        {
            int nodesAtThatLevel = q.size();
            List<Integer> finalListToBeAddedInAnswerList=new LinkedList<Integer>();
            
            for(int i=0; i<nodesAtThatLevel; i++) 
            {
                if(q.peek().left != null)
                {
                    q.offer(q.peek().left);
                }
                if(q.peek().right != null) 
                {
                    q.offer(q.peek().right);
                }
                finalListToBeAddedInAnswerList.add(q.poll().val);
            }
            a.add(finalListToBeAddedInAnswerList);
        }
        
        return a;
    }
}
