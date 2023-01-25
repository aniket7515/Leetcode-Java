class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n=edges.length;
        int[] A=new int[n];
        int[] B=new int[n];
        Arrays.fill(A,Integer.MAX_VALUE);
        Arrays.fill(B,Integer.MAX_VALUE);
        
        bfs(node1,A,edges,n);
        bfs(node2,B,edges,n);
        
        int res=Integer.MAX_VALUE;
        int node=-1;
        for(int i=0;i<n;i++){
            if(A[i]==Integer.MAX_VALUE || B[i]==Integer.MAX_VALUE) continue;
            if(res>Math.max(A[i],B[i])){
                node=i;
                res=Math.max(A[i],B[i]);
            }
            
        }
        return node;
        
        
        
    }
    public void bfs(int src, int[] dist,int[] edges, int n){
        Queue<Integer> q= new LinkedList<>();
        q.add(src);
        dist[src]=0;
        while(!q.isEmpty()){
            int node=q.remove();
            if(edges[node]!=-1 && dist[edges[node]]==Integer.MAX_VALUE ){
                q.add(edges[node]);
                dist[edges[node]]=dist[node]+1;
            }
        }
        
        
    }
}