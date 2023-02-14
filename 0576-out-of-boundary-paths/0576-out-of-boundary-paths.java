class Solution {
    long mod = 1_000_000_007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long[][][] dp= new long[51][51][51];
        for(int i=0;i<51;i++){
            for(int j=0;j<51;j++){
                for(int k=0;k<51;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return (int)(func(m,n,maxMove,startRow,startColumn,dp)%mod);
    }
    public long func(int m, int n, int maxMove, int startRow, int startColumn, long[][][] dp){
        if(startRow<0 || startColumn<0 || startRow>=m || startColumn>=n ) return 1;
        if(maxMove==0) return 0;
           if(dp[startRow][startColumn][maxMove]!=-1) return (dp[startRow][startColumn][maxMove]);
        return dp[startRow][startColumn][maxMove]= func(m,n,maxMove-1,startRow,startColumn+1,dp)%mod+func(m,n,maxMove-1,startRow+1,startColumn,dp)%mod+func(m,n,maxMove-1,startRow,startColumn-1,dp)%mod+func(m,n,maxMove-1,startRow-1,startColumn,dp)%mod; 
        
    }
}