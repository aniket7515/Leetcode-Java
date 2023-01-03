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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q= new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> sublist= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                sublist.add(0,node.val);
            }
            ans.add(sublist.get(0));
        }
        
        return ans;
        
    }
}