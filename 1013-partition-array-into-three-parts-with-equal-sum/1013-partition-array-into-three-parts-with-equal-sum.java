class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totSum=0;
        for(int i=0;i<arr.length;i++) totSum+=arr[i];
        if(totSum%3!=0) return false;
        
        int sum = totSum/3;
        int count=0;
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr==sum){
                count++;
                curr=0;
            }
            
        }
        if(sum==0) return count>=3;
        return count>=3;
        
        
        
    }
}