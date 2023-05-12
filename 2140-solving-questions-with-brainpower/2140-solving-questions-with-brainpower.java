class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp= new long[questions.length+1];
        Arrays.fill(dp,-1);
        return func(0,questions,dp);
    }
    public long func(int ind, int[][] questions, long[] dp){
        if(ind>=questions.length) return 0;
        if(dp[ind]!=-1) return dp[ind];
        long take= questions[ind][0] + func(ind+questions[ind][1]+1,questions,dp);
        long notTake= func(ind+1,questions,dp);
        
        dp[ind]=Math.max(take,notTake);
        return dp[ind];
        
    }
}