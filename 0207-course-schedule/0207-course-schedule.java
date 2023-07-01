class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> arr= new ArrayList<>();
        
        for(int i=0;i<numCourses;i++) arr.add(new ArrayList<>());
        
        for(int[] pre:prerequisites){
            arr.get(pre[1]).add(pre[0]);
        }
        int[] vis= new int[numCourses+1];
        int[] pathVis= new int[numCourses+1];
        
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(dfs(i,arr,vis,pathVis)==true) return false;
            }
        }
        return true;
        
    }
    public boolean dfs(int node, List<List<Integer>> arr, int[] vis, int[] pathVis){
        vis[node]=1;
        pathVis[node]=1;
        
        for(Integer it: arr.get(node)){
            if(vis[it]==0){
                if(dfs(it,arr,vis,pathVis)) return true;
                
            }else if(pathVis[it]==1) return true;
        }
        pathVis[node]=0;
        return false;
    }
}