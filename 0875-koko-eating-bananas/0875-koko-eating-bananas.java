class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int low=1;
        int high=max;
        // int ans=1000000000;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(piles,mid,h)){
                // ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
    public boolean isPossible(int[] nums,int num, int h){
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            count+= Math.ceil(nums[i]*1.0/num);
         
          
           
        }
        return count<=h;
    }
}