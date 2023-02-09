class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return func(0,-1,nums,dp);
    }
    public int func(int  ind, int prev_ind , int[] nums, int[][] dp){
        if(ind==nums.length) return 0;
        if(dp[ind][prev_ind+1]!=-1) return dp[ind][prev_ind+1];
        int len= 0+ func(ind+1,prev_ind,nums,dp);
        if(prev_ind==-1 || nums[ind]>nums[prev_ind]){
            len=Math.max(len,1+func(ind+1,ind,nums,dp));
        }
        
        return dp[ind][prev_ind+1]= len;
    }
}