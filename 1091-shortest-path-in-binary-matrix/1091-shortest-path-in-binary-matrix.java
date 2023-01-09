class Solution {
    class Points{
        int x;
        int y;
        Points(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length-1;
        if(grid[0][0]==1 || grid[n][n]==1) return -1;
        
        Queue<Points> q= new LinkedList<>();
        q.offer(new Points(0,0));
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Points head=q.poll();
                int x=head.x;
                int y=head.y;
                if(x==n && y==n) return level+1;
                grid[x][y]=2;
                for(int delRow=-1;delRow<=1;delRow++){
                    for(int delCol=-1;delCol<=1;delCol++){
                        int nrow=x+delRow;
                        int ncol=y+delCol;
                        if(nrow>=0 && nrow<=n && ncol>=0 && ncol<=n && grid[nrow][ncol]==0){
                            grid[nrow][ncol]=2;
                            q.add(new Points(nrow,ncol));
                        }
                    }
                }
                
            }
            level++;
            
        }
        return -1;
    }
}