class Solution {
    public boolean canJump(int[] nums) {
        int n= nums.length;
        int recheable=0;
        for(int i=0;i<n;i++){
            if(recheable<i) return false;
            recheable=Math.max(recheable,i+nums[i]);
        }
        return true;

      
    }
}