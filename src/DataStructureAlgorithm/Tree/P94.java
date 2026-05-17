package DataStructureAlgorithm.Tree;

public class P94 {
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
        public void solve(TreeNode root,List<Integer> list)
        {
            if(root == null) return;
            solve (root.left,list);
            list.add(root.val);
            solve(root.right,list);
        }
        public List<Integer> inorderTraversal(TreeNode root) {


            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> s= new  Stack<>();

            if(root == null) return list;

            while(true)
            {
                if(root!=null)
                {
                    s.push(root);
                    root=root.left;
                }else{
                    if(s.empty()) break;
                    root =s.pop();
                    list.add(root.val);
                    root=root.right;
                }
            }


            // solve(root,list);
            return list;

        }
    }
}
