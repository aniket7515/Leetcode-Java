class Solution {
     
    public boolean exist(char[][] board, String word) {
       boolean[][] vis= new boolean[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if((word.charAt(0)==board[i][j]) && func(board,word,i,j,0,vis)) return true;
            }
        }
        return false;
        
    }
    public boolean func(char[][] board, String word, int i, int j, int index,boolean[][] vis){
        if(index==word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[i].length || board[i][j]!=word.charAt(index) || vis[i][j]) return false;
        
        vis[i][j]=true;
        
        if(func(board,word,i-1,j,index+1,vis) || func(board,word,i+1,j,index+1,vis) || func(board,word,i,j-1,index+1,vis) || func(board,word,i,j+1,index+1,vis)) return true;
        
        vis[i][j]=false;
        
        return false;
    }
}