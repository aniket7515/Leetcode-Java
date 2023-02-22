class Solution {
    Boolean[] dp;
    public boolean validPartition(int[] nums) {
        dp=new Boolean[nums.length];
        return func(nums,0);
    }
    public boolean func(int[] nums, int i){
        if(i>=nums.length) return true;
         if(dp[i]!=null) return dp[i];
        if(i<=(nums.length-3) && nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
            return dp[i]= func(nums,i+2) || func(nums,i+3);
        }
        if(i<=(nums.length-2) && nums[i]==nums[i+1]){
            return dp[i]= func(nums,i+2);
        }
        if(i<=(nums.length-3)){
            if((nums[i+1]-nums[i])==1 && (nums[i+2]-nums[i+1])==1) return dp[i]= func(nums,i+3);
        }
        
        
        return false;
        
    }
}