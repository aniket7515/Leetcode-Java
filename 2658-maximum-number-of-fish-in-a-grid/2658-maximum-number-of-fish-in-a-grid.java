class Solution {
    public int findMaxFish(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    int a= func(grid,i,j);
                    max=Math.max(max,a);
                }
            }
        }
        return max;
    }
    public int func(int[][] grid , int row, int col){
        int[] DelRow={0,1,0,-1};
        int[] DelCol={1,0,-1,0};
        int m=grid.length;
        int n= grid[0].length;
        boolean[][] vis= new boolean[m][n];
        
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{row,col});
        vis[row][col]=true;
        int sum=grid[row][col];
        
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int Row=arr[0];
            int Col=arr[1];
            
            for(int i=0;i<4;i++){
                int nRow= Row+ DelRow[i];
                int nCol= Col+ DelCol[i];
                
                if(nRow>=0 && nCol>=0 && nRow<m && nCol<n && vis[nRow][nCol]==false && grid[nRow][nCol]>0 ){
                    sum+=grid[nRow][nCol];
                    q.add(new int[]{nRow, nCol});
                    vis[nRow][nCol]=true;
                    
                }
                
            }
        }
        return sum;
        
    }
}