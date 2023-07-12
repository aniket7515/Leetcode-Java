class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int[][] dp= new int[cost.length+1][cost.length+1];
        for(int[] d:dp) Arrays.fill(d,-1);
        return func(cost,0,cost.length,time,dp);
    }
    public int func(int[] nums , int ind, int tot, int[] time, int[][] dp){
        if(tot<=0)
            return 0;
        if(ind==nums.length){
            return (int)1e9;   
        }
        if(dp[ind][tot]!=-1) return dp[ind][tot];
        int notTake= func(nums,ind+1,tot,time,dp);
        int take= nums[ind]+func(nums,ind+1,tot-time[ind]-1,time,dp);
        
        return dp[ind][tot]= Math.min(take,notTake);
    }
}