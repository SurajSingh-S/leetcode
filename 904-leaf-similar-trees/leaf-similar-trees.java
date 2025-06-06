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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();

        helper(root1,list1);
        helper(root2,list2);

        return list1.equals(list2);

    }

    public void helper(TreeNode root,List<Integer> res){
        if(root==null) return;
        if(root.left==null && root.right==null){
            res.add(root.val);
            return;
        }
        helper(root.left,res);
        helper(root.right,res);
    }
}