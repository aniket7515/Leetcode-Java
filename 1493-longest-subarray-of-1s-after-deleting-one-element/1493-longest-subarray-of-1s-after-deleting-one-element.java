class Solution {
    public int longestSubarray(int[] nums) {
        
        int max=0;
       
        int i=0;
        int j=0;
        // int len=0;
        int sum=0;
        while(j<nums.length){
            sum+=nums[j];
            while(i<j && sum<j-i){
                sum-=nums[i++];
            }
            max=Math.max(max,j-i);
            j++;
        }
        return max;
        
        
//         for(;i<nums.length;i++){
//             if(nums[i]==0){
//                 zeroCnt++;
                
//             }
//             if(nums[i]==1) oneCnt++;
            
//             if(nums[i]==1 && zeroCnt<=1){
//                 len++;
//                 // oneCnt++;
//                 max=Math.max(max,len);
//             }
//             if(zeroCnt>1){
//                 zeroCnt=0;
//                 len=0;
//                 // i=i-max-1;
//             }
//         }
//         if(oneCnt==nums.length) return nums.length-1;
//         return max;
    }
}