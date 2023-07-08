class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q= new LinkedList<>();
        
        for(int i=1;i<=n;i++) q.add(i);
        int cnt=0;
        while(q.size()!=1){
            
            
            int a=q.poll();
            cnt++;
            if(cnt==k){
                cnt=0;
                continue;
                
            }
            q.add(a);
        }
        return q.poll();
        
    }
}