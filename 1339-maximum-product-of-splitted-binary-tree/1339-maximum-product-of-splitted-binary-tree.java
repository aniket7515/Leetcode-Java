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
    long maxRes=Integer.MIN_VALUE;
    public int maxProduct(TreeNode root) {
        long totalSum=totalTreeSum(root);
        maxP(root,totalSum);
        return (int)(maxRes % 1000000007);
        
    }
    public long maxP(TreeNode root, long totalSum){
        if(root==null) return 0;
        long left=maxP(root.left,totalSum);
        long right=maxP(root.right,totalSum);
        
        long sum=root.val+left+right;
        
        maxRes=Math.max(maxRes,(totalSum-sum)*sum);
        
        return sum;
        
        
    }
    
    public long totalTreeSum(TreeNode root){
        if(root==null) return 0;
        
        return root.val+totalTreeSum(root.left)+totalTreeSum(root.right);
    }
}