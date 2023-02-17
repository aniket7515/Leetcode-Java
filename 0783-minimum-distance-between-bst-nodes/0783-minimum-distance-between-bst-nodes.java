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
    List<Integer> arr= new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        dfs(root,arr);
        int diff=Integer.MAX_VALUE;
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
            diff=Math.min(diff,arr.get(i+1)-arr.get(i));
        }
        return diff;
    }
    public void dfs(TreeNode root,List<Integer> arr){
        if(root==null) return;
        dfs(root.left,arr);
        arr.add(root.val);
        dfs(root.right,arr);
    }
}