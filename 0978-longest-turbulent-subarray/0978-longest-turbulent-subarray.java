class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int count=0;
        int currCnt=0;
        
        for(int i=0;i<arr.length;i++){
            if(i>=2 && ((arr[i-2]>arr[i-1] && arr[i-1]<arr[i]) || (arr[i-2]<arr[i-1] && arr[i-1]>arr[i]))) currCnt++;
            else if(i>=1 && arr[i-1]!=arr[i]) currCnt=2;
            
            else{
                currCnt=1;
            }
            count=Math.max(count,currCnt);
            
            
        }
        return count;
        
    }
}