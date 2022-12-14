class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int ans=0;
        int start=0;
        int end=0;
        char[] str=s.toCharArray();
        int[] c= new int[3];
        while(end<s.length()){
            c[str[end]-'a']++;
            
            while(start<=end && c[0]>0 && c[1]>0 && c[2]>0){
                ans+=n-end;
                c[str[start++]-'a']--;
            }
           
            end++;
        }
        return ans;
        
    }
}