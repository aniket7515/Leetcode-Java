class Solution {
    public String longestDiverseString(int a, int b, int c) {
        HashMap<Character,Integer> map= new HashMap<>();
        if(a>0) map.put('a',a);
        if(b>0) map.put('b',b);
        if(c>0) map.put('c',c);
        
        
        
        PriorityQueue<Character> pq= new PriorityQueue<>((e,d)-> map.get(d)-map.get(e));
        
        pq.addAll(map.keySet());
        StringBuilder sb= new StringBuilder();
        
        while(pq.size()>1){
            char first =pq.poll();
            char second=pq.poll();
            
            if(map.get(first)>=2){
                sb.append(first);
                sb.append(first);
                map.put(first,map.get(first)-2);
            }else if(map.get(first)==1){
                sb.append(first);
                map.put(first,map.get(first)-1);
            }
            if( map.get(first)<=map.get(second) && map.get(second)>=2){
                sb.append(second);
                sb.append(second);
                map.put(second,map.get(second)-2);
            }else if(map.get(second)<map.get(first) || map.get(second)==1){
                sb.append(second);
                map.put(second,map.get(second)-1);
            } 
            
            if(map.get(first)>=1) pq.offer(first);
            if(map.get(second)>=1) pq.offer(second);
            
        }
        
        if(!pq.isEmpty()){
            if(map.get(pq.peek())>=2){
                sb.append(pq.peek());
                sb.append(pq.peek());
            }
            else{
                sb.append(pq.peek());
            }
        }
        
        return sb.toString();
        
        
        
        
        
    }
}