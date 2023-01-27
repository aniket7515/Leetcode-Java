class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int[][] dp= new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            ans= Math.min(ans,func(m-1,i,matrix,dp));
        }
        return ans;
    }
    public int func(int i, int j , int[][] matrix, int[][] dp){
        int m=matrix[0].length;
        
        if(j<0 || j>=m) return Integer.MAX_VALUE;
        if(i==0) return matrix[0][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int st=func(i-1,j,matrix,dp);
        int ld=func(i-1,j-1,matrix,dp);
        int rd=func(i-1,j+1,matrix,dp);
        
        return dp[i][j]= matrix[i][j]+Math.min(st, Math.min(ld,rd));
        
        
        
    }
}