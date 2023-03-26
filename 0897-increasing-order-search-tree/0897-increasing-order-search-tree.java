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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> arr= new ArrayList<>();
        inorder(root,arr);
        TreeNode node= new TreeNode(arr.get(0));
        TreeNode curr=node;
        for(int i=1;i<arr.size();i++){
            if(i==arr.size()-1) {
                curr.left=null;
                curr.right=null;
            }
            curr.left=null;
            curr.right= new TreeNode(arr.get(i));
            curr=curr.right;
            
        }
        
        return node;
        
        
    }
    public void inorder(TreeNode root,  List<Integer> arr){
        if(root!=null){
            inorder(root.left,arr);
            arr.add(root.val);
            inorder(root.right,arr);
        }
    }
}