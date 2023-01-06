class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i:nums) pq.add(i);
        
        while(k-->0){
            int num=pq.poll()+1;
            
            pq.add(num);
        }
        long product=1;
        while(!pq.isEmpty()){
            product=(product*pq.poll())%1000000007;
        }
        return (int)(product);
        
    }
}