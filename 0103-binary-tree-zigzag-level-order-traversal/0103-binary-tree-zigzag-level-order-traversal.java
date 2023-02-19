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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> wrapList = new ArrayList<>();
        boolean flag=false;
        if(root==null) return wrapList;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int val=queue.size();
            List<Integer> subList=new ArrayList<>(val);
            for(int i=0;i<val;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                if(flag==false) subList.add(queue.poll().val);
                else{
                    subList.add(0,queue.poll().val);
                }
            }
            flag=!flag;
            wrapList.add(subList);
        }
        
        return wrapList;
    }
}