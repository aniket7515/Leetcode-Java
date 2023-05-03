class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> map= new HashMap<>();
        
        for(int i=0;i<senders.length;i++){
            if(map.containsKey(senders[i])){
                map.put(senders[i], map.get(senders[i])+count(messages[i]));
            }else{
                map.put(senders[i],count(messages[i]));
            }
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        int max=0;
        String name="";
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            int a=entry.getValue();
            if(a>max){
                max=a;
                name=entry.getKey();
            }
            else if(a==max){
                if(entry.getKey().compareTo(name) >= 0){
                    name=entry.getKey();
                }
            }
        }
        return name;
        
    }
    public int count(String s){
        int cnt=0;
        for(String s1:s.split(" ")){
            cnt++;
        }
        return cnt;
    }
}