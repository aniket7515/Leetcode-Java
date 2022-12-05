class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<heights.length-1;i++){
            int diff=heights[i+1]-heights[i];
            if(diff>0) pq.add(diff);
            if(pq.size()>ladders) bricks-=pq.poll();
            if(bricks<0) return i;
        }
        return heights.length-1;
        
        
//         for(int i=0;i<heights.length-1;i++){
//            if((heights[i+1]-heights[i])<=0) continue;
//             if(heights[i]<heights[i+1]){
//                 if((heights[i+1]-heights[i])>bricks && ladders<1) return i;
//                 if((heights[i+1]=heights[i])<=bricks){
//                     bricks-=(heights[i+1]-heights[i]);
//                 }else{
//                     if(ladders>0){
//                         ladders--;
//                     }
//                     else return i;
//                 }
                
//             }
//         }
//         if(heights[heights.length-2]>heights[heights.length-1])  return heights.length-1;
//         return heights.length-2;
    }
}