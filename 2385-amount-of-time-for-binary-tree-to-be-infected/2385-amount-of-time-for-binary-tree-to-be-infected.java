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
    public int amountOfTime(TreeNode root, int start) {
        HashMap<Integer, HashSet<Integer>> map= new HashMap<>();
        inorder(root,-1,map);
        int result=0;
        Queue<Integer> q= new LinkedList<>();
        q.add(start);
        HashSet<Integer> visited= new HashSet<>();
        visited.add(start);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.poll();
                for(int num:map.get(curr)){
                    if(!visited.contains(num)){
                        visited.add(num);
                        q.add(num);
                    }
                }
            }
            result++;
        }
        return result-1;
        
    }
    public void inorder(TreeNode root, int prev , HashMap<Integer, HashSet<Integer>> map){
        if(root==null) return;
        if(!map.containsKey(root.val)) map.put(root.val,new HashSet<>());
        if(prev!=-1){
            map.get(root.val).add(prev);
        }
        if(root.left!=null) map.get(root.val).add(root.left.val);
        if(root.right!=null) map.get(root.val).add(root.right.val);
        inorder(root.left,root.val,map);
        inorder(root.right,root.val,map);
        
    }
}