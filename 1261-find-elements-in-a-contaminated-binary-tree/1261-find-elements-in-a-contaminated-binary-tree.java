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
class FindElements {
    TreeNode node;
    HashSet<Integer> set= new HashSet<>();
    public FindElements(TreeNode root) {
        node=root;
        if(node!= null){
            node.val=0;
            set.add(node.val);
        }
        
        inorder(node);
    }
    public void inorder(TreeNode node){
       
        if(node!=null){
            
            if(node.left!=null){
                node.left.val=2*node.val+1;
                set.add(node.left.val);
                inorder(node.left);
            }
            if(node.right!=null){
                node.right.val=2*node.val+2;
                set.add(node.right.val);
                inorder(node.right);
            }
            
        }
    }
    
    public boolean find(int target) {
       return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */