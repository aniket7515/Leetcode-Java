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
    List<Integer> arr = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return createBST(0,arr.size()-1);
    }
    public TreeNode createBST( int start, int end){
        if(start>end) return null;
        int mid=(start+end)/2;
        
        TreeNode node= new TreeNode(arr.get(mid));
        
        node.left= createBST(start,mid-1);
        node.right=createBST(mid+1,end);
        
        return node;
        
        
    }
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            arr.add(root.val);
            inorder(root.right);
        }
    }
}