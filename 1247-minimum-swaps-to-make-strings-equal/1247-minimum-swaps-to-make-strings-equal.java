class Solution {
    public int minimumSwap(String s1, String s2) {
        if(s1.length()!=s2.length()) return -1;
        
        
        int xCount=0;
        int yCount=0;
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='x' && s2.charAt(i)=='y') xCount++;
            else if(s1.charAt(i)=='y' && s2.charAt(i)=='x') yCount++;
        }
        int ans=0;
        if(xCount%2!=yCount%2) return -1;
        
        ans+= xCount/2+ yCount/2;
        if(xCount%2==1) ans+=2;
        
        return ans;
        
        
        
    }
}