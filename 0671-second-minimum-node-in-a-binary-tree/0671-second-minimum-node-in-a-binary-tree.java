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
    HashSet<Integer> set = new HashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        inorder(root);
        List<Integer> ans = new ArrayList<>(set);
        if(ans.size()<=1) return -1;
        Collections.sort(ans);
        return ans.get(1);
        
        
    }
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            set.add(root.val);
            inorder(root.right);
        }
    }
}