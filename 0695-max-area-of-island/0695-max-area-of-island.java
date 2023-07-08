class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                max=Math.max(max,func(grid,i,j));
            }
        }
        return max;
    }
    public int func(int[][] grid, int i, int j){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]==0) return 0;
        grid[i][j]=0;
        return 1+ func(grid,i-1,j)+func(grid,i+1,j)+func(grid,i,j-1)+func(grid,i,j+1);
    }
}