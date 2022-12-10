class Solution {
    public int countBattleships(char[][] board) {
        
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    count++;
                     dfs(board,i,j);
                } 
            }
        }
        return count;
    }
    public void dfs(char[][] board , int row, int col){
        board[row][col]='.';
        if(row>0 && board[row-1][col]=='X') dfs(board,row-1,col);
        if(row<board.length-1 && board[row+1][col]=='X') dfs(board,row+1,col);
        if(col>0 && board[row][col-1]=='X') dfs(board,row,col-1);
        if(col<board[0].length-1 && board[row][col+1]=='X') dfs(board,row,col+1);
    }
}