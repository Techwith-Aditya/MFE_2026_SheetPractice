class Solution {
    public int getLevelDiff(Node root) {
        return dfs(root, 0);  // Start level from 0 (root level is even)
    }

    private int dfs(Node node, int level) {
        int sum=0;
        if(node==null) 
        {
            return 0;
        }

        if(level%2==0)  
        {
            sum=node.data;
        }
        else  
        {
            sum=-node.data;
        }
        return sum + dfs(node.left, level+1) + dfs(node.right, level+1);
    }
}
