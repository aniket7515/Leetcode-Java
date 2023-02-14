class Solution {
    public boolean judgeCircle(String moves) {
        int i=0;
        int j=0;
        
        for(int k=0;k<moves.length();k++){
            if(moves.charAt(k)=='U'){
                j++;
            }
            else if(moves.charAt(k)=='D'){
                j--;
            }
            else if(moves.charAt(k)=='R'){
                i++;
            }
            else if(moves.charAt(k)=='L'){
                i--;
            }
        }
        
        return (i==0 && j==0);
        
    }
}