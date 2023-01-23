class Solution {
    public String greatestLetter(String s) {
        int[] freq1= new int[26];
        int[] freq2= new int[26];
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                freq1[s.charAt(i)-'a']++;
            }else{
                freq2[s.charAt(i)-'A']++;
            }
        }
        for(int i=25;i>=0;i--){
            if(freq1[i]>=1 &&  freq2[i]>=1) return (char)(i+'A')+"";
        }
        
        return "";
        
        
    }
}