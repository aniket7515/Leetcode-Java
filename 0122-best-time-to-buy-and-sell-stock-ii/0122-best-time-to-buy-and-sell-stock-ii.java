class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        return func(0,true,prices,dp);
    }
    public int func(int ind, boolean buy,int[] prices,int[][] dp){
        if(ind==prices.length) return 0;
        int profit=0;
        if(dp[ind][(buy==false)?0:1]!=-1) return dp[ind][(buy==false)?0:1];
        if(buy){
            profit=Math.max(-prices[ind]+func(ind+1,false,prices,dp), func(ind+1,true,prices,dp));
        }else{
             profit=Math.max(prices[ind]+func(ind+1,true,prices,dp), func(ind+1,false,prices,dp));
        }
        
        return dp[ind][(buy==false)?0:1]= profit;
    }
}