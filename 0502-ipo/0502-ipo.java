class Solution {
    class Pair{
        int p;
        int c;
        Pair(int p, int c){
            this.p=p;
            this.c=c;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<Pair> arr= new ArrayList<>();
        for(int i=0;i<profits.length;i++){
            arr.add(new Pair(profits[i],capital[i]));
        }
        
        Collections.sort(arr, (a,b)-> a.c-b.c);
        int i=0;
        PriorityQueue<Integer>  pq= new PriorityQueue<>(Collections.reverseOrder());
        while(k-->0){
            
            while(i<arr.size() && (arr.get(i).c)<=w){
                    pq.add(arr.get(i).p);
                i++;
                
                
            }
            if(!pq.isEmpty()){
                
                w+=pq.peek();
                pq.poll();
            }
        }
        return w;
        
    }
}