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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return maxBinaryTree(nums,0,nums.length-1);
    }
    public TreeNode maxBinaryTree(int[] nums,int start,int end){
        if(start>end) return null;
        int max=Integer.MIN_VALUE;
        int index=0;
        
        for(int i=start;i<=end;i++){
            if(nums[i]>=max){
                max=nums[i];
                index=i;
            }
        }
        TreeNode root=new TreeNode(max);
        
        root.left=maxBinaryTree(nums,start,index-1);
        root.right=maxBinaryTree(nums,index+1,end);
        return root;
    }
}