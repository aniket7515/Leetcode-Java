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
    public int rob(TreeNode root) {
        return func(root, new HashMap<>());
    }
    public int func(TreeNode root, Map<TreeNode,Integer> map){
        if(root==null) return 0;
        int ans=0;
        if(map.containsKey(root)) return map.get(root);
        if(root.left!=null){
            ans+= func(root.left.left,map)+func(root.left.right,map);
        }
        if(root.right!=null){
            ans+= func(root.right.left,map)+func(root.right.right, map);
        }
        ans= Math.max(ans+root.val,func(root.left,map)+func(root.right, map));
        map.put(root,ans);
        return ans;
        
    }
}