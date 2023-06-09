class Solution {
    
    class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n= grid[0].length;
        int cnt=0;
        int[][] vis= new int[m][n];
        for(int[] v:vis) Arrays.fill(v,0);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    cnt++;
                    bfs(grid,vis,m,n,i,j);
                }
            }
        }
        return cnt;
        
    }
    public void bfs(char[][] grid, int[][] vis , int m, int n, int i, int j){
        Queue<Pair> q= new LinkedList<>();
        vis[i][j]=1;
        q.add(new Pair(i,j));
        
        while(!q.isEmpty()){
            int row= q.peek().first;
            int col= q.peek().second;
            q.remove();
            int[] delRow={-1,0,1,0};
            int[] delCol={0,1,0,-1};
            
            for(int k=0;k<4;k++){
                int nrow= row+delRow[k];
                int ncol= col+delCol[k];
                
                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }
                
            }
            
            
        }
        
    }
    
    
}