class Solution {
    public int longestBeautifulSubstring(String word) {
        int maxLen=0;
        int count=1;
        int len=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i-1)==word.charAt(i)) len++;
            else if(word.charAt(i-1)<word.charAt(i)){
                len++;
                count++;
            }else{
                len=1;
                count=1;
            }
            
            if(count==5){
                maxLen=Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}