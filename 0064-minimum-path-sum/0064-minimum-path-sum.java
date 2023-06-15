class Solution {
    public int minPathSum(int[][] grid) {
        // int sum=Integer.MAX_VALUE;
        int[][] dp= new int[grid.length][grid[0].length];
        for(int[] d:dp) Arrays.fill(d,-1);
        return func(grid,grid.length-1, grid[0].length-1,dp);
    }
    public int func(int[][] grid, int i, int j, int[][] dp){
        
        
        if(i==0 && j==0) return grid[i][j];
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int up= func(grid, i, j-1,dp);
        int left= func(grid, i-1,j,dp);
        
        return dp[i][j]= grid[i][j] + Math.min(up,left);
        
    }
    
}