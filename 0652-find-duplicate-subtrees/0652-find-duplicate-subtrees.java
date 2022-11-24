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
    HashMap<String,Integer> map = new HashMap<>();
    List<TreeNode> res= new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }
    public String traverse(TreeNode node){
        if(node==null) return "$";
        String subStr= node.val+","+traverse(node.left)+","+traverse(node.right);
        map.put(subStr,map.getOrDefault(subStr,0)+1);
        
        if(map.get(subStr)==2) res.add(node);
        
        return subStr;
        
    }
}