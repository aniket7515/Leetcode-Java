class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pq1= new PriorityQueue<>();
        PriorityQueue<Integer> pq2= new PriorityQueue<>();
        int leftBound=candidates;
        int rightBound=costs.length-candidates-1;
        
        long sum=0;
        for(int i=0;i<candidates;i++) pq1.add(costs[i]);
        for(int i=costs.length-1; i>=Math.max(candidates,costs.length-candidates); i--) pq2.add(costs[i]);
        
        while(k>0){
            if(pq1.size()>0 && pq2.size()>0){
                if(  pq1.peek()<=pq2.peek()){
                    sum+=pq1.peek();
                    pq1.remove();
                    if(leftBound<=rightBound){
                        pq1.add(costs[leftBound]);
                        leftBound++;
                    }
                }else{
                    sum+=pq2.peek();
                    pq2.remove();
                    if(leftBound<=rightBound){
                        pq2.add(costs[rightBound]);
                        rightBound--;
                    }
                }
            }
            else if(pq1.size()!=0){
                sum+=pq1.peek();
                pq1.remove();
            }else{
                sum+=pq2.peek();
                pq2.remove();
            }
            
            
            k--;
        }
        return sum;
        
        
        
    }
}