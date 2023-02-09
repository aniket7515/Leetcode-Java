class Solution {
    public int maxProfit(int k, int[] prices) {
       int[][][] dp= new int[prices.length][2][k+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<2;j++){
                for(int m=0;m<=k;m++){
                    dp[i][j][m]=-1;
                }
            }
        }
        return func(0,1,prices,k,dp);
    }
    public int func(int ind, int buy , int[] prices , int k, int[][][] dp){
        if(ind==prices.length || k==0) return 0;
        int profit=0;
        if(dp[ind][buy][k]!=-1) return dp[ind][buy][k];
        if(buy==1){
            profit=Math.max(-prices[ind]+func(ind+1,0,prices,k,dp), func(ind+1,1,prices,k,dp));
        }else{
            profit=Math.max(prices[ind]+func(ind+1,1,prices,k-1,dp), func(ind+1,0,prices,k,dp));
        }
        
        return dp[ind][buy][k]= profit;
        
    }
}