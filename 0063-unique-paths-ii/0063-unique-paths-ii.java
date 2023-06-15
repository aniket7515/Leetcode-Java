class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;
        int[][] dp= new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        return func(obstacleGrid,m-1,n-1,dp);
        
        
    }
    public int func(int[][] arr, int i , int j, int[][] dp){
        if(i>=0 && j>=0 && arr[i][j]==1) return 0;
        if(i<0 || j<0) return 0;
        
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int left= func(arr,i-1,j,dp);
        int up= func(arr,i,j-1,dp);
        
        return dp[i][j]= up+left;
    }
   
}