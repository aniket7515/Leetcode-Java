class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        int cnt=0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()%2==1) cnt++;
        }
        if(cnt>k) return false;
        return true;
        
    }
}