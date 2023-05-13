class Solution {
    class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i:barcodes) map.put(i, map.getOrDefault(i,0)+1);
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)-> b.y-a.y);
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
       
        int i=0;
        int[] ans= new int[barcodes.length];
        while(!pq.isEmpty()){
            Pair a= pq.remove();
            while(a.y-->0){
                ans[i]=a.x;
                i+=2;
                if(i>=ans.length) i=1;
            }
           
        }
        return ans;
    }
}