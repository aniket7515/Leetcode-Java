class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                if(isMagic(grid, i, j)) count++;
            }
        }
        return count;
        
        
    }
    public boolean isMagic(int[][] grid, int i , int j){
        return isDistinct(grid,i,j) && rowSum(grid, i,j) && colSum(grid,i,j) && DiagonalSum(grid,i,j);
    }
    
    public boolean rowSum(int[][] grid, int i, int j){
        int r1=grid[i][j]+grid[i][j+1]+grid[i][j+2];
        int r2=grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2];
        int r3=grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
        
        return (r1==r2 && r2==r3);
    }
    public boolean colSum(int[][] grid, int i, int j){
        int c1=grid[i][j]+grid[i+1][j]+grid[i+2][j];
        int c2=grid[i][j+1]+grid[i+1][j+1]+grid[i+2][j+1];
        int c3=grid[i][j+2]+grid[i+1][j+2]+grid[i+2][j+2];
        
        return (c1==c2 && c2==c3);
    }
    public boolean DiagonalSum(int[][] grid, int i, int j){
        int d1=grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
        int d2=grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j];
        
        return d1==d2;
    }
    public boolean isDistinct(int[][] grid, int row, int col){
        boolean[] nums= new boolean[10];
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(grid[i][j]==0 || grid[i][j]>9 || nums[grid[i][j]]==true) return false;
                else{
                    nums[grid[i][j]]=true;
                }
            }
        }
        return true;
    }
}