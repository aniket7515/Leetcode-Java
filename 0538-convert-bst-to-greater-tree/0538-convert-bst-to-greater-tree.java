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
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        // List<Integer> arr= new ArrayList<>();
   
        if(root!=null){
            convertBST(root.right);
            sum+=root.val;
            root.val=sum;
            convertBST(root.left);
        }
        return root;
    }
    // public void inorder(TreeNode root, List<Integer> arr){
    //     if(root!=null){
    //         inorder(root.left,arr);
    //         arr.add(root.val);
    //         inorder(root.right,arr);
    //     }
    // }
    // public int greaterSum(List<Integer> arr, int val){
    //     int sum=0;
    //     for(int i=0;i<arr.size();i++){
    //         if(arr.get(i)>=val){
    //             sum+=arr.get(i);
    //         }
    //     }
    //     return sum;
    // }
}