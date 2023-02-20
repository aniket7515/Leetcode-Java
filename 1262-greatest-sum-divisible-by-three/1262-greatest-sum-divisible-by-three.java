class Solution {
    public int maxSumDivThree(int[] nums) {
       
       
        int[][] dp= new int[nums.length+1][3];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        
        return func(nums,0,0,dp);
    }
    public int func(int[] nums, int ind,int sum,int[][] dp){
       if(ind>=nums.length){
           if(sum==0) return 0;
           return -100000;
       }
        if(dp[ind][sum]!=-1) return dp[ind][sum];
        
        
        int take=nums[ind]+ func(nums,ind+1,(sum+nums[ind])%3,dp);
        int notTake=func(nums,ind+1,sum,dp);
        
        return dp[ind][sum]= Math.max(take,notTake);
            
    }
}