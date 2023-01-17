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
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null) return 0;
        int count=0;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    if(isLeaf(node.left)==true){
                        count+=node.left.val;
                    }
                    q.add(node.left);
                }
                if(node.right!=null) q.add(node.right);
            }
        }
        return count;
    }
    public boolean isLeaf(TreeNode node){
        if(node==null) return false;
        if(node.left==null && node.right==null) return true;
        return false;
    } 
}