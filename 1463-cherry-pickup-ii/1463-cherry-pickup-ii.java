class Solution {
    public int cherryPickup(int[][] grid) {
        int[][][] dp= new int[grid.length+1][grid.length+1][grid[0].length+1];
        
        for(int[][] d:dp){
            for(int[] i:d) Arrays.fill(i,-1);
        }
        
        return func(grid,0,0,grid[0].length-1,grid.length, grid[0].length,dp);
    }
    public int func(int[][] grid, int i, int j1, int j2, int row, int col,int[][][] dp){
        
        if(j1<0 || j2<0 || j1>=col || j2>=col) return -99999999;
        
        if(i==row-1){
            if(j1==j2) return grid[i][j1];
            else return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        int max=-99999999;
        for(int ncol1=-1;ncol1<=1;ncol1++){
            for(int ncol2=-1;ncol2<=1;ncol2++){
                int val=0;
                if(j1==j2) val+=grid[i][j1];
                else val+=(grid[i][j1]+grid[i][j2]);
                val+= func(grid,i+1,j1+ncol1,j2+ncol2,row,col,dp);
                max=Math.max(max,val);
            }
        }
        return dp[i][j1][j2]= max;
        
    }
}