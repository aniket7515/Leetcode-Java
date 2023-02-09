class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        return func(0,true,prices,dp,fee);
    }
    public int func(int ind, boolean buy,int[] prices,int[][] dp, int fee){
        if(ind==prices.length) return 0;
        int profit=0;
        if(dp[ind][(buy==false)?0:1]!=-1) return dp[ind][(buy==false)?0:1];
        if(buy){
            profit=Math.max(-prices[ind]+func(ind+1,false,prices,dp,fee), func(ind+1,true,prices,dp,fee));
        }else{
             profit=Math.max(prices[ind]-fee+func(ind+1,true,prices,dp,fee), func(ind+1,false,prices,dp,fee));
        }
        
        return dp[ind][(buy==false)?0:1]= profit;
    }
}