class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        dfs(row,  col , grid,grid[row][col]);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0) grid[i][j]=color;
            }
        }
        return grid;
    }
    int[] delRow={0,1,0,-1};
    int[] delCol={1,0,-1,0};
    public void dfs(int row, int col ,int[][] grid, int clr){
        int n=grid.length;
        int m=grid[0].length;
        
        int count=0;
        grid[row][col]=-clr;
        
        for(int i=0;i<4;i++){
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            
            if(nrow<0 || nrow>=n || ncol<0 || ncol>=m || Math.abs(grid[nrow][ncol])!=clr){
                continue;
            }
            
            count++;
            if(grid[nrow][ncol]==clr) dfs(nrow,ncol,grid,clr);
            
        }
        if(count==4){
            grid[row][col]=clr;
        }
        
        
        
    }
}