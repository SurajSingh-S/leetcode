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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        dfs(list,res,root,targetSum);
        return res;
    }
    public void dfs(List<Integer>list,List<List<Integer>> res,TreeNode root,int targetSum){
        if(root == null) return;
        list.add(root.val);

        if(root.left==null && root.right==null && targetSum==root.val){
            res.add(new ArrayList<>(list));
            
        }
        else{
            dfs(list,res,root.left,targetSum-root.val);
            dfs(list,res,root.right,targetSum-root.val);
            
        }
        list.remove(list.size()-1);
        
    }
}