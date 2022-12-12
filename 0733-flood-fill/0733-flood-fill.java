class Solution {
    int[] delRow={-1,0,1,0};
    int[] delCol={0,1,0,-1};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor=image[sr][sc];
        if(initialColor==color) return image;
        dfs(image,sr,sc,initialColor,color);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc,int initialColor , int color){
        
        
        image[sr][sc]=color;
        
        for(int i=0;i<4;i++){
            int nrow=sr+delRow[i];
            int ncol=sc+delCol[i];
            
            if(nrow>=0 && ncol>=0 && nrow<image.length && ncol<image[0].length && image[nrow][ncol]==initialColor){
                dfs(image,nrow,ncol,initialColor,color);
            }
            
        }
        
        
    }
}