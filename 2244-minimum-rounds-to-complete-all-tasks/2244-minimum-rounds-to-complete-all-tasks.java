class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int round=0;
        for(Map.Entry entry:map.entrySet()){
            int val=(int)entry.getValue();
            if(val==1) return -1;
            if(val>=3){
                round+=val/3;
                if(val%3!=0) round+=1;
            }else if(val==2) round+=1;
        }
        return round;
    }
}