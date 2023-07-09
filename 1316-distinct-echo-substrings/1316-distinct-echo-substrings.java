class Solution {
    public int distinctEchoSubstrings(String text) {
        HashSet<String> set= new HashSet<>();
        
        for(int len=1;len<=(text.length()/2);len++){
            int cnt=0;
            for(int i=0,j=len;j<text.length();i++,j++){
                if(text.charAt(i)==text.charAt(j)) cnt++;
                else cnt=0;
                
                if(cnt==len){
                    set.add(text.substring(i,j+1));
                    cnt--;
                }
            }
        }
        return set.size();
    }
}