class Solution {
    public int waysToMakeFair(int[] nums) {
        int index=0;
        int[] oddSum=new int[nums.length];
        int[] evenSum= new int[nums.length];
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                evensum+=nums[i];
                
            }else{
                oddsum+=nums[i];
                
            }
            evenSum[i]=evensum;
            oddSum[i]=oddsum;
        }
        
        for(int i=0;i<nums.length;i++){
            int neven=0;
            int nodd=0;
            int n=nums.length;
            if(i==0){
                nodd= evenSum[nums.length-1]-evenSum[0];
                neven= oddSum[n-1];
            }else{
                nodd= oddSum[i-1]+evenSum[n-1]- evenSum[i];
                neven=evenSum[i-1]+ oddSum[n-1]-oddSum[i];
            }
            if(nodd==neven) index++;
        }
        return index;
        
    }
}