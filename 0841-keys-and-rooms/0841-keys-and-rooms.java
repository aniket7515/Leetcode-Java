class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] vis= new boolean[n];
        vis[0]=true;
        dfs(rooms,0,vis);
        for(int i=0;i<n;i++){
            if(vis[i]==false) return false;
        }
        return true;
        
        
        
        
    }
    public void dfs(List<List<Integer>> rooms, int index,boolean[] vis){
        for(int i:rooms.get(index)){
            if(!vis[i]){
                vis[i]=true;
                dfs(rooms,i,vis);
            }
        }
    }
}