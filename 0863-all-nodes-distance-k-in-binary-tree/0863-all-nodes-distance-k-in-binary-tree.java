/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent= new HashMap<>();
        markParents(root,parent);
        Map<TreeNode,Boolean> vis= new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        vis.put(target,true);
        
        int curr_level=0;
        
        while(!q.isEmpty()){
            int size=q.size();
            if(curr_level==k) break;
            curr_level++;
            for(int i=0;i<size;i++){
                TreeNode current=q.poll();
                if(current.left!=null && vis.get(current.left)==null){
                    q.offer(current.left);
                    vis.put(current.left,true);
                }
                if(current.right!=null && vis.get(current.right)==null){
                    q.offer(current.right);
                    vis.put(current.right,true);
                }
                if(parent.get(current)!=null && vis.get(parent.get(current))==null){
                    q.offer(parent.get(current));
                    vis.put(parent.get(current),true);
                }
                
            }
           
            
            
        }
         List<Integer> result= new ArrayList<>();
            while(!q.isEmpty()){
                TreeNode current= q.poll();
                result.add(current.val);
            }
            
            return result;
        
        
        
    }
    public void markParents(TreeNode root, Map<TreeNode,TreeNode> parent){
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                parent.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right!=null){
                parent.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
        
    }
    
    
}