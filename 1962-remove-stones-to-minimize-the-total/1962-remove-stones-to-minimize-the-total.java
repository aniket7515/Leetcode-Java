class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<piles.length;i++){
            pq.add(piles[i]);
        }
        while(k-->0){
            int t=pq.poll();
            double ans=Math.floor(t/2);
            t-=ans;
            pq.add(t);
            
            
        }
        int sum=0;
        while(pq.isEmpty()==false){
            sum+=pq.poll();
        }
        return sum;
        
    }
}