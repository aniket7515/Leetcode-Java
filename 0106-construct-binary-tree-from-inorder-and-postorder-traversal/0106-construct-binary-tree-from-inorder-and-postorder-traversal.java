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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length) return null;
        
        HashMap<Integer,Integer> map=  new HashMap<>();
        
        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);
        
        return buildTreePoIn(inorder,  0,  inorder.length-1, postorder, 0,postorder.length-1,map);
        
        
        
        
    }
    public TreeNode buildTreePoIn(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, HashMap<Integer,Integer> map){
        if(ps>pe || is>ie) return null;
        TreeNode root= new TreeNode(postorder[pe]);
        int inRoot=map.get(postorder[pe]);
        int numsLeft=inRoot-is;
        
        root.left=buildTreePoIn(inorder,is,inRoot-1,postorder,ps,ps+numsLeft-1,map);
        
        root.right=buildTreePoIn(inorder,inRoot+1,ie,postorder,ps+numsLeft,pe-1,map);
        return root;
        
        
        
    }
}