class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int n=triangle.get(m-1).size();
        int[][] dp= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return func(0,0,triangle,dp);
        
    }
    public int func(int i, int j, List<List<Integer>> triangle, int[][] dp){
        int n=triangle.size();
        if(i==n-1) return triangle.get(i).get(j);
        if(dp[i][j]!=-1) return dp[i][j];
        int down=func(i+1,j,triangle,dp);
        int diag=func(i+1,j+1, triangle,dp);
        
        return dp[i][j]=triangle.get(i).get(j) + Math.min(down,diag);
        
    }
}