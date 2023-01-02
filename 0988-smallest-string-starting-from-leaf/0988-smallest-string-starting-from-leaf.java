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
    public String smallestFromLeaf(TreeNode root) {
        String smallest="";
        List<Integer> list= new ArrayList<>();
        List<List<Integer>> output= new ArrayList<>();
        traverse(root,list,output);
        
        for(List<Integer> i:output){
            StringBuilder sb= new StringBuilder();
            for(int j=0;j<i.size();j++){
                char c=(char)(i.get(j)+'a');
                sb.append(c);
            } 
            
            String str=sb.reverse().toString();
            if(smallest.equals("")) smallest=str;
            if(smallest.compareTo(str)>0) smallest=str;
        }
        return smallest;
        
    }
    public void traverse(TreeNode root,List<Integer> list, List<List<Integer>> output){
        if(root==null) return;
        list.add(root.val);
        if(root.left==null && root.right==null){
            output.add(new ArrayList(list));
        }
        
        traverse(root.left,new ArrayList(list),output);
        traverse(root.right,new ArrayList(list),output);
    }
}