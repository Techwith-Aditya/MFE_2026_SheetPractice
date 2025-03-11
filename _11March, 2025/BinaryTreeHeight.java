public class Solution {
    public static int heightOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int leftH=1+heightOfBinaryTree(root.left);
        int rightH=1+heightOfBinaryTree(root.right);
        return Math.max(leftH, rightH);
    }
}
