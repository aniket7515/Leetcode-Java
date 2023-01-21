class Solution {
    public int minDeletion(int[] nums) {
        int del=0;
        for(int i=0;i<nums.length-1;i++){
            int newIdx=i-del;
            if(newIdx%2==0 && nums[i]==nums[i+1]) del++;
        }
        
        int n=nums.length;
        return (n-del)%2==0?del:del+1;
    }
}