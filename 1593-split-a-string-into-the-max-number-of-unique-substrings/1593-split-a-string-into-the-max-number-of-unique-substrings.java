class Solution {
    int max=0;
    public int maxUniqueSplit(String s) {
        HashSet<String> set= new HashSet<>();
        func(s,set,0);
        return max;
        
    }
    public void func(String s, HashSet<String> set, int ind){
        
        if(ind>=s.length()){
            max=Math.max(max,set.size());
        }
        
        for(int i=ind+1;i<=s.length();i++){
            String s1= s.substring(ind,i);
            if(set.add(s1)){
                func(s,set,i);
                set.remove(s1);
            }
        }
        
    }
}