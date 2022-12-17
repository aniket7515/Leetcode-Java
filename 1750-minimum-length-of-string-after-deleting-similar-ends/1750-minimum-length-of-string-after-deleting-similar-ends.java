class Solution {
    public int minimumLength(String s) {
        int len=s.length();
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                char c=s.charAt(i);
                while(  i<j && s.charAt(i)==c){
                    i++;
                    len--;
                }
                while( j>=i && s.charAt(j)==c){
                    j--;
                    len--;
                }
            }
            else break;
                
        }
            
        return len;
        
        
    }
}