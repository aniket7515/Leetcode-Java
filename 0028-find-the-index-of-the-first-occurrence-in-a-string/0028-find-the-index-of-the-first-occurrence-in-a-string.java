class Solution {
    public int strStr(String haystack, String needle) {
           
        int m=haystack.length();
        int n=needle.length();
        if(haystack==null || needle==null || m<n){
            return -1;
        }
        if(n==0) return 0;
     
        
        for(int i=0;i<=(m-n);i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if((haystack.substring(i,n+i)).equals(needle)){
                    return i;
                }
            }
        }
       
        return -1;
       
   
        
    }
}