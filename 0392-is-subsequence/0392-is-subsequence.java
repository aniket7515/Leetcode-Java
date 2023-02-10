class Solution {
    public boolean isSubsequence(String s, String t) {
        return func(s.length()-1,t.length()-1,s,t);
    }
    public boolean func(int i, int j, String s, String t){
        if(i<0) return true;
        if(j<0 && i>=0) return false;
        
        if(s.charAt(i)==t.charAt(j)){
            return func(i-1,j-1,s,t);
        }
        return func(i,j-1,s,t);
        
    }
}