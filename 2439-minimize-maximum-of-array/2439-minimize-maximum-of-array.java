class Solution {
    public int minimizeArrayValue(int[] nums) {
        double sum=0;
        double res=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res=Math.max(res,Math.ceil((sum*1.0)/(i+1)));
        }
        return (int)res;
    }
}