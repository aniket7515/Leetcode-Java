class Solution {
    public int countSubstrings(String s) {
       int cnt=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String a= s.substring(i,j+1);
                if(palindrome(a)) cnt++;
            }
        }
        return cnt;
    }
//     public int func(int ind, String s){
            
//     }
    public boolean palindrome(String a){
        if(a.length()==1) return true;
        int i=0;
        int j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}