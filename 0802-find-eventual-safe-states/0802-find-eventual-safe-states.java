class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adjRev= new ArrayList<>();
        for(int i=0;i<graph.length;i++) adjRev.add(new ArrayList<>());
        
        int[] indegree= new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int j:graph[i]){
                adjRev.get(j).add(i);
                indegree[i]++;
            }
        }
        
        Queue<Integer> q= new LinkedList<>();
        
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0) q.add(i);
        }
        List<Integer> ans= new ArrayList<>();
        // int i=0;
        while(!q.isEmpty()){
            int node= q.peek();
            q.remove();
            ans.add(node);
            
            for(int it:adjRev.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }
            
        }
        Collections.sort(ans);
        return ans;
        
        
        
    }
}