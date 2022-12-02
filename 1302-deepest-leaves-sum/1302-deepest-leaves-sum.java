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
    public int deepestLeavesSum(TreeNode root) {
        int ht=height(root);
        int level=1;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node= q.poll();
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
                if(level==ht) sum+=node.val;
            }
            level++;
        }
        return sum;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
}