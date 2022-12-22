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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key) return Helper(root);
        TreeNode dummy=root;
        while(root!=null){
            if(root.val>key){
                if(root.left!=null && root.left.val==key){
                    root.left=Helper(root.left);
                    break;
                }else{
                    root=root.left;
                }
            }else{
                if(root.right!=null && root.right.val==key){
                    root.right=Helper(root.right);
                    break;
                }else{
                    root=root.right;
                }
            }
        }
        return dummy;
    }
    public TreeNode findLastRight(TreeNode root){
        if(root.right==null) return root;
        return findLastRight(root.right);
    }
    public TreeNode Helper(TreeNode root){
        
        if(root.left==null) return root.right;
        else if(root.right==null) return root.left;
        
            TreeNode rightChild=root.right;
            TreeNode lastChild=findLastRight(root.left);
            lastChild.right=rightChild;
            return root.left;
        
    }
}