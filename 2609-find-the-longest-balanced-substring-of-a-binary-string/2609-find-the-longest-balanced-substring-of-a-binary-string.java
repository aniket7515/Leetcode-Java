class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans=0;
        String temp="01";
        while(temp.length()<=s.length()){
            if(s.contains(temp)) ans=temp.length();
            temp="0"+temp+"1";
        }
        return ans;
    }
   
}