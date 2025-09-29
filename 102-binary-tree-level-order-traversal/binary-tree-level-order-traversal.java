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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>();

        if(root==null) return result;

        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> currentlevel= new ArrayList<>();
            int size= queue.size();

            for(int i=0;i< size;i++){
                TreeNode current= queue.poll();
                currentlevel.add(current.val);

                if(current.left != null){
                    queue.offer(current.left);
                }

                if(current.right != null){
                    queue.offer(current.right);
                }
            }
            result.add(currentlevel);
        }
    return result;

    }
}