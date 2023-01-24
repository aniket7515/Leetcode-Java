class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp= new int[cost.length+1];
        Arrays.fill(dp,-1);
       func(0,cost,dp);
        return Math.min(dp[0],dp[1]);
    }
    public int func(int ind,int[] cost,int[] dp){
        if(ind>=cost.length) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int left=func(ind+1,cost,dp);
        
        int right=func(ind+2,cost,dp);
        
        return dp[ind]= (Math.min(left,right)+cost[ind]);
        
        
        // if(ind==0 || ind==1) return cost[ind];
        // int left=func(ind-1,cost)+cost[ind];
        // int right=Integer.MAX_VALUE;
        // if(ind-2>=0) right=func(ind-2,cost)+cost[ind];
        // return Math.min(left,right);
    }
}