package DataStructureAlgorithm.Tree;

public class p98 {
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
        public List<Integer> solve(TreeNode root,List<Integer> list)
        {
            if(root==null) return list;
            solve(root.left,list);
            list.add(root.val);
            solve(root.right,list);
            return list;
        }
        public boolean isValidBST(TreeNode root) {
            List<Integer> l1 = new ArrayList<Integer>();
            solve(root,l1);

            for(int i=0; i<l1.size()-1;i++)
            {
                if(l1.get(i)>=l1.get(i+1)) return false;
            }
            return true;
        }
    }
}
