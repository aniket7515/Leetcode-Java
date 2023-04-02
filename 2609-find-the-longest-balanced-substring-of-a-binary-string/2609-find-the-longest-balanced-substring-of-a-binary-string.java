class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans=0;
        String temp="01";
        while(temp.length()<=s.length()){
            if(s.indexOf(temp)>=0 && s.indexOf(temp)<s.length()) ans=temp.length();
            temp="0"+temp+"1";
        }
        return ans;
    }
   
}