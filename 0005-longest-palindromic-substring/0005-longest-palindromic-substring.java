class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        String ans="";
       for(int i=0;i<s.length();i++){
           for(int j=i+1;j<=s.length();j++){
               if(isPalindrome(s.substring(i,j))){
                   // System.out.println(s.substring(i,j));
                  if(ans.length()< s.substring(i,j).length()) ans=s.substring(i,j);
               }
           }
       }
        return ans;
        
    }
    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
                j--;
        }
        return true;
    }
     
}