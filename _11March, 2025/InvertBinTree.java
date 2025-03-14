class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) 
        {
            return null;
        }

        TreeNode leftSubtree=invertTree(root.left);
        TreeNode rightSubtree=invertTree(root.right);
        
        // swap them...
        root.left=rightSubtree;
        root.right=leftSubtree;

        return root;
    }
}
