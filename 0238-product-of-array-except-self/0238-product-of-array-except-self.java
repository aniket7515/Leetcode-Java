class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int cnt=0;
        for(int i:nums){
            if(i==0) cnt++;
            if(i!=0)product*=i;
            
        } 
        if(cnt==nums.length){
            Arrays.fill(nums,0);
            return nums;
        }
        if(cnt>0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0 && cnt==1) nums[i]=product;
                else nums[i]=0;
            }
            return nums;
        }
        
        for(int i=0;i<nums.length;i++){
            
             nums[i]= (product/nums[i]);
        }
        return nums;
    }
}