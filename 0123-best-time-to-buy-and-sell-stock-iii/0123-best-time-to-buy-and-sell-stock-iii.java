class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp= new int[prices.length][2][3];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return func(0,1,prices,2,dp);
    }
    public int func(int ind, int buy , int[] prices , int cap, int[][][] dp){
        if(ind==prices.length || cap==0) return 0;
        int profit=0;
        if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
        if(buy==1){
            profit=Math.max(-prices[ind]+func(ind+1,0,prices,cap,dp), func(ind+1,1,prices,cap,dp));
        }
        else{
            profit=Math.max(prices[ind]+func(ind+1,1,prices,cap-1,dp), func(ind+1,0,prices,cap,dp));
        }
        
        return dp[ind][buy][cap]= profit;
        
    }
}