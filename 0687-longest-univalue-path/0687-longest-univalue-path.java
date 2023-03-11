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
    public int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans=0;
        if(root==null) return 0;
        
        helper(root,root.val);
        return ans;
        
    }
    public int helper(TreeNode node, int prev){
        
        if(node==null) return 0;
        
        int left= helper(node.left,node.val);
        int right=helper(node.right,node.val);
        
        ans=Math.max(ans, left+right);
        
        if(prev==node.val) return Math.max(left,right)+1;
        
        return 0;
        
        
    }
    
    
    
    
}