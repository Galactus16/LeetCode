/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sol = 0;
        
        if(root == null){
            return 0;
        }
        
        if(root.right != null){
            sol += sumOfLeftLeaves(root.right);
        }
            
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                sol += root.left.val;
            }else{
                sol += sumOfLeftLeaves(root.left);
            }   
        }
        
        return sol;
    }
}