class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        for(int[] d:dp) Arrays.fill(d,-1);
        int LCS=func(word1,word2,word1.length()-1,word2.length()-1,dp);
        return (word1.length()+word2.length()-(2*LCS));
    }
    public int func(String s1, String s2, int i, int j,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) {
            return 1+func(s1,s2,i-1,j-1,dp);
        }
        return dp[i][j]= Math.max(func(s1,s2,i-1,j,dp),func(s1,s2,i,j-1,dp));
        
    }
}
