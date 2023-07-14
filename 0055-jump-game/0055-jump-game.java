class Solution {
    public boolean canJump(int[] nums) {
        // int n= nums.length;
        // int recheable=0;
        // for(int i=0;i<n;i++){
        //     if(recheable<i) return false;
        //     recheable=Math.max(recheable,i+nums[i]);
        // }
        // return true;
        int[] dp= new int[nums.length];
        Arrays.fill(dp,-1);
        return func(nums,0,dp);

      
    }
    public boolean func(int[] nums, int ind, int[] dp){
        if(ind>=nums.length-1) return true;
        if(nums[ind]==0) return false;
       if(dp[ind]!=-1) return dp[ind]==1;
        int a=nums[ind];
        for(int i=1;i<=a;i++){
            if(func(nums,ind+i,dp)){
                dp[ind]=1;
                return true;
            }
        }
        dp[ind]=0;
        return false;
        
    }
}