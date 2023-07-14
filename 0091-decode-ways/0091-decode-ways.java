class Solution {
    public int numDecodings(String s) {
        int[] dp= new int[s.length()+1];
        Arrays.fill(dp,-1);
        return func(s,0,dp);
    }
    public int func(String s, int ind, int[] dp){
        if(ind==s.length()) return 1;
        if(s.charAt(ind)=='0') return 0;
        if(dp[ind]!=-1) return dp[ind];
        int one= func(s,ind+1,dp);
        int two=0;
        if(ind<s.length()-1 && Integer.parseInt(s.substring(ind,ind+2))<=26){
            two= func(s,ind+2,dp);
        }
        return dp[ind]= one+two;
    }
}