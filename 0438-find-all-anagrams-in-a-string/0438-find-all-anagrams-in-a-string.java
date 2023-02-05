class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int lens = s.length();
        int lenp = p.length();
        List<Integer> res = new ArrayList<>();
        for(int i =0;i<=lens-lenp;i++){
            String temp = s.substring(i,i+lenp);
            if(isAnagram(temp, p)){
                res.add(i);
            }
        }
        return res;
    }
    public boolean isAnagram(String s , String p){
        int[] freq= new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch1: p.toCharArray()){
            freq[ch1-'a']--;
        }
        for(int i: freq){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
   
}