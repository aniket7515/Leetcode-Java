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
    
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        LinkedList<TreeNode> q= new LinkedList<>();
        int max=1;
        q.offer(root);
        root.val=0;
        
        while(!q.isEmpty()){
            int s=q.peekLast().val;
            int e=q.peekFirst().val;
            max=Math.max(max,s-e+1);
            
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    node.left.val=node.val*2;
                    q.offer(node.left);
                }
                if(node.right!=null){
                    node.right.val=node.val*2+1;
                    q.offer(node.right);
                }
            }
            
        }
        return max;
        
        
        
        
        
    }
}



