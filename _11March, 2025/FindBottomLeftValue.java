class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int ans=-1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            ans=node.val;
            if(node.right!=null)
            {
                q.add(node.right);
            }
            if(node.left!=null)
            {
                q.add(node.left);
            }
        }
        return ans;
    }
}
