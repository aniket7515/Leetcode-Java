class Solution {
    public int longestPalindromeSubseq(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--) rev+=s.charAt(i);
        int i=s.length()-1;
        int j=s.length()-1;
        int[][] dp= new int[i+1][j+1];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        return func(i,j,s,rev,dp);
        
    }
    public int func(int i, int j,String text1, String text2, int[][] dp){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j)) return 1+ func(i-1,j-1,text1,text2,dp);
        
        return dp[i][j]= Math.max(func(i-1,j,text1,text2,dp),func(i,j-1,text1,text2,dp));
        
    }
}