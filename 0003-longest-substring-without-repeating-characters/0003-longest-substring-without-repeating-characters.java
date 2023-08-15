class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set= new HashSet<>();
        int start=0;
        int end=0;
        int len=0;
        int max=0;
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                max=Math.max(max,set.size());
                end++;
                
            }else{
                set.remove(s.charAt(start));
                start++;
            }
            
        }
        
        return max;
        
    }
}