class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] clone=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            clone[i]=nums[i];
        }
        Arrays.sort(clone);
        int l=-1;
        int h=-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=clone[i]){
                l=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=clone[i]){
                h=i;
                break;
            }
        }
        if(l==h) return 0;
        return h-l+1;
        
    }
}