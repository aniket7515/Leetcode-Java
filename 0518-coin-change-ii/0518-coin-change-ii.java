class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] d:dp) Arrays.fill(d,-1);
    
        return func(coins.length-1,amount,coins,dp);
    }
    public int func(int ind, int amt, int[] coins,int[][] dp){
        if(ind==0){
            return (amt%coins[0]==0)?1:0;
        }
        if(dp[ind][amt]!=-1) return dp[ind][amt];
        int notTake=func(ind-1,amt,coins,dp);
        int take=0;
        if(coins[ind]<=amt){
            take=func(ind,amt-coins[ind],coins,dp);
        }
        
        return dp[ind][amt]= (take+notTake);
    }
}