package DataStructureAlgorithm.Tree;

public class P543 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        int maxi =0;
        public int solve(TreeNode root)
        {
            if(root == null) return 0;
            int ld = solve(root.left);
            int rd= solve(root.right);

            maxi = Math.max(maxi,ld+rd);
            return 1+ Math.max(ld,rd);
        }
        public int diameterOfBinaryTree(TreeNode root) {
            solve(root);
            return maxi;
        }
    }
}
