class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
       long ans=0;
        int n=nums.length;
        
        int minI=-1;
        int maxI=-1;
        int start=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]<minK || nums[i]>maxK){
                start=i+1;
                minI=maxI=-1;
            } 
            if(nums[i]==minK) minI=i;
            if(nums[i]==maxK) maxI=i;
            
            ans=ans+ Math.max(0L, Math.min(minI,maxI)-start+1);
        }
        
        return ans;
        
    }
}