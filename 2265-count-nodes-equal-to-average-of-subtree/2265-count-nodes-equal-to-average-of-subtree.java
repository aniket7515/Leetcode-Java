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
    int count=0;
    int sum=0;
    public int averageOfSubtree(TreeNode root) {
        int ans=0;
        if(root==null) return 0;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int res=0;
        while(!q.isEmpty()){
            sum=0;
            count=0;
            res=0;
            int size=q.size();
           
            TreeNode node=q.poll();
            if(node.left!=null) q.offer(node.left);
            if(node.right!=null) q.offer(node.right);
            findAverage(node);
            res+=sum;
            if(res/count==node.val) ans++;
            
            
        }
        return ans;
    }
    public void findAverage(TreeNode root){
        if(root==null) return;
        findAverage(root.left);
        sum+=root.val;
        count++;
        findAverage(root.right);
        
        
        
    }
}