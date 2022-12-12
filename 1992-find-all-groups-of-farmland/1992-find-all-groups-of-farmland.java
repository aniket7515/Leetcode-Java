class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> res= new ArrayList<>();
        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(land[i][j]==1){
                    int[] end= new int[]{i,j};
                    dfs(land,i,j,end);
                    res.add(new int[]{i,j,end[0],end[1]});
                }
            }
        }
        return res.toArray(new int[0][0]);
    }
    public void dfs(int[][] land , int i , int j,int[] end){
       
        if(i<0 || j<0 || i>=land.length || j>=land[0].length || land[i][j]==0) return;
        land[i][j]=0;
        end[0]=Math.max(i,end[0]);
        end[1]=Math.max(j,end[1]);
        
        dfs(land,i+1,j,end);
        dfs(land,i,j+1,end);
        
        
    }
}