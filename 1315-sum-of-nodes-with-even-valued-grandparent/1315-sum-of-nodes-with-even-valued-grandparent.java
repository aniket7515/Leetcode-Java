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
    int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root);
        return sum;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        
        if(root.val%2==0){
            if(root.left!=null){
                sum+=value(root.left.left) + value(root.left.right);
            }
            if(root.right!=null){
                sum+=value(root.right.left)+ value(root.right.right);
            }
        }
        dfs(root.left);
        dfs(root.right);
        
        return sum;
        
    }
    public int value(TreeNode root){
        return root!=null?root.val:0;
    }
}