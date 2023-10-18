class Solution {
    public int rob(int[] nums) {
        int[] dp= new int[nums.length];
        Arrays.fill(dp,-1);
       int ind=nums.length;
        return func(ind-1,nums,dp);
        
        
    }
    public int func(int ind, int[] nums,int[] dp){
        if(ind==0) return nums[ind];
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int pick=nums[ind]+func(ind-2,nums,dp);
        int notPick=func(ind-1,nums,dp);
        
        return dp[ind]= Math.max(pick,notPick);
        
    }
}