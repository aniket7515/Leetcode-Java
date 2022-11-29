class Solution {
    public int minIncrementForUnique(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                while(nums[i]<=nums[i-1]){
                    nums[i]++;
                    count++;
                }
            }
        }
        return count;
        
        
        
    }
}