class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);    
        }
        PriorityQueue<Character> pq= new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(pq.isEmpty()==false){
            char ch=pq.poll();
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        
        return sb.toString();
        
        
    }
}