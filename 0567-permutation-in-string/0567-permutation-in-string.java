class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq= new int[26];
        Arrays.fill(freq,0);
        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }
        int j=0, i=0, totalChar=s1.length();
        while(j<s2.length()){
            if(freq[s2.charAt(j++)-'a']-->0){
                
                totalChar--;
            }
            if(totalChar==0) return true;
            if(j-i==s1.length() && freq[s2.charAt(i++)-'a']++ >=0) totalChar++;
        }
        return false;
    }
}