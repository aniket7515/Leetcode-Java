class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Queue<Integer> q= new LinkedList<>();
        List<List<Integer>> graph= build(n,edges);
        boolean[] vis = new boolean[n];
        
        q.offer(source);
        
        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==destination) return true;
            vis[curr]=true;
            for(int surr: graph.get(curr)){
                if(!vis[surr]) q.offer(surr);
            }
        }
        return false;
        
        
        
    }
    public List<List<Integer>> build(int n, int[][] edges){
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
        
    }
}