class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp= new int[coins.length][amount+1];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        int ans= func(coins.length-1,amount,coins,dp);
        if(ans>=(int)Math.pow(10,9)) return -1;
        return ans;
    }
    public int func(int ind, int amount, int[] coins,int[][] dp){
        if(ind==0){
            if(amount%coins[0]==0) return (amount/coins[0]);
            return (int)Math.pow(10,9);
        }
        if(dp[ind][amount]!=-1) return dp[ind][amount];
        int notTake=func(ind-1,amount,coins,dp);
        int take=Integer.MAX_VALUE;
        
        if(amount>=coins[ind]) take=1+func(ind,amount-coins[ind],coins,dp);
        
        return dp[ind][amount]= Math.min(notTake,take);
        
    }
}