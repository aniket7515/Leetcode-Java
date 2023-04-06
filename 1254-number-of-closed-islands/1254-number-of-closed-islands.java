class Solution {
   
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i*j==0 || i==n-1 || j==m-1){
                    if(grid[i][j]==0) dfs(i,j,grid);
                    
                }
            }
        } 
        
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
    
    public void dfs(int row, int col , int[][] grid){
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        grid[row][col]=1;
      
        int n=grid.length;
        int m=grid[0].length;
        
        for(int i=0;i<4;i++){
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==0){
                dfs(nrow,ncol,grid);
            }
        }
        
    }
    

}