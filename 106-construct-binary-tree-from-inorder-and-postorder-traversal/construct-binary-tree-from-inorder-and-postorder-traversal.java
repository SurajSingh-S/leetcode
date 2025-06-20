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
    int postindex;
    Map<Integer,Integer> inordermap;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postindex=postorder.length-1;
        inordermap= new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            inordermap.put(inorder[i],i);
        }
     
        return helper(postorder,0,inorder.length-1);

    }

    public TreeNode helper(int [] postorder,int left,int right){
        if(left>right) return null;

        int rootval= postorder[postindex--];
        TreeNode root= new TreeNode(rootval);

        int index= inordermap.get(rootval);
        
        root.right=helper(postorder,index+1,right);
        root.left=helper(postorder,left,index-1);

        return root;
    }


}