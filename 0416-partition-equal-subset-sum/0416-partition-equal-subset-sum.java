class Solution {
    public boolean canPartition(int[] nums) {
        int totSum=0;
        for(int i:nums) totSum+=i;
        if(totSum%2==1) return false;
       
        int target=totSum/2;
        int ind=nums.length-1;
         int[][] dp= new int[nums.length+1][totSum];
        for(int[]i : dp){
            Arrays.fill(i,-1);
        }
        return func(ind,target,nums,dp);
        
    }
    public boolean func(int ind, int target, int[] nums,int[][] dp){
        if(target==0) return true;
        if(ind==0) return (nums[0]==target);
        if(dp[ind][target]!=-1) return dp[ind][target]!=0;
        boolean notTaken= func(ind-1,target,nums,dp);
        boolean taken=false;
        if(nums[ind]<=target) taken= func(ind-1,target-nums[ind],nums,dp);
        
        dp[ind][target]= (notTaken || taken)?1:0;
        
        return (taken||notTaken);
    }
}