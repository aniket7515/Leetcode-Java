class Solution {
    // class Pair{
    //     int first;
    //     int second;
    //     Pair(int first, int second){
    //         this.first=first;
    //         this.second=second;
    //     }
    // }
    
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
    
    
    
    
    // public void bfs(int row, int col , int[][] grid , int[][] vis){
    //     vis[row][col]=1;
    //     Queue<Pair> q= new LinkedList<>();
    //     q.add(new Pair(row,col));
    //     int n=grid.length, m=grid[0].length;
    //     while(!q.isEmpty()){
    //         int row1=q.peek().first;
    //         int col1=q.peek().second;
    //         q.remove();
    //         int[] delRow={-1,0,1,0};
    //         int[] delCol={0,1,0,-1};
    //         for(int i=0;i<4;i++){
    //             int nrow= row1+delRow[i];
    //             int ncol= col1+delCol[i];
    //             if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==0 && vis[nrow][ncol]==0){
    //                 vis[nrow][ncol]=1;
    //                 q.add(new Pair(nrow,ncol));
    //             }
    //         }
    //     }
    // }
}