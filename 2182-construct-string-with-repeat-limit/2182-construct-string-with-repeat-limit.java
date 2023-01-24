class Solution {
    public class Pair{
        char key;
        int val;
        Pair(char key, int val){
            this.key=key;
            this.val=val;
        }
    }
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq= new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        PriorityQueue<Pair> pq= new PriorityQueue<>((Pair a, Pair b)-> b.key-a.key);
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                pq.add(new Pair((char)(i+'a'),freq[i]));
            }
            
        }
        
        StringBuilder sb= new StringBuilder();
        while(pq.size()>0){
            Pair pair=pq.poll();
            int count=pair.val;
            for(int i=0;i<repeatLimit && count>0 ; i++){
                sb.append(pair.key);
                count--;
            }
            if(count>0 && pq.size()>0){
                Pair second=pq.poll();
                sb.append(second.key);
                if(second.val>1){
                    pq.add(new Pair(second.key,second.val-1));
                }
                pq.add(new Pair(pair.key,count));
            }
        }
        
        return sb.toString();
        
        
    }
}