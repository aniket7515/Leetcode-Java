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
    int maxSumLevel=0;
    public int maxLevelSum(TreeNode root) {
        bfs(root);
        return maxSumLevel;
    }
    public void bfs(TreeNode root){
        
        int level=1;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int maxSum=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size=q.size();
            
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
                
            }
            if(sum>maxSum){
                maxSum=sum;
                maxSumLevel=level;
            }
            level++;
            
        }
        
    }
}