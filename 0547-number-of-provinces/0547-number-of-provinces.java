class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++) list.add(new ArrayList<Integer>());
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        int[] vis= new int[isConnected.length];
        int  count=0;
        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==0){
                count++;
                dfs(i,list,vis);
            }
        }
        return count;
        
        
        
        
    }
    public void dfs(int node , List<ArrayList<Integer>> list , int[] vis){
        vis[node]=1;
        for(Integer it: list.get(node)){
            if(vis[it]==0){
                dfs(it,list,vis);
            }
        }
    }
}