class Solution {
    public void rotate(int[][] matrix) {
        // to rotate the matrix first we will find the transpose of matrix and then we will reverse row and will get anser
        
        // FInd transpose of matrix --> Transpose of matrix means when row is converted to column and column is converted to row
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        // reverse rows
        for(int i=0;i<matrix.length;i++){
            int low=0;
            int high=matrix.length-1;
            
            while(low<high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
            
        }
        
    }
}