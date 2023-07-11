class Solution {
    public int numberOfWays(int startPos, int endPos, int k) {
        int[][] dp= new int[4001][1001];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        return func(startPos,endPos,k,dp);
    }
    public int func(int start, int end, int k , int[][] dp){
        if(k==0){
            if(start==end) return 1;
            return 0;
        }
        if(dp[start+2001][k]!=-1) return dp[start+2001][k];
        int left= func(start-1,end,k-1,dp);
        int right=func(start+1,end,k-1,dp);
        
        return dp[start+2001][k]= (left+right)%1000000007;
        
        
    }
}