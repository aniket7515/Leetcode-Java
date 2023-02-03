class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] ans=new int[mat.length][mat[0].length];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int sum=0;
                for(int l=i-k;l<=i+k;l++){
                    for(int m=j-k;m<=j+k;m++){
                        if(l>=0 && m>=0 && l<mat.length && m<mat[0].length) sum+=mat[l][m];
                    }
                }
                ans[i][j]=sum;
            }
        }
        return ans;
        
        
        
    }
}