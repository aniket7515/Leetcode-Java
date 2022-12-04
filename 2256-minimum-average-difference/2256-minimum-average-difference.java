class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
        }
        
        long mini = Long.MAX_VALUE;
        int minIdx = 0;
        long prevSum = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            long avg2=0;
            prevSum+=nums[i];
            long avg1 = prevSum/(i+1);
            if((nums.length-(i+1))>0){
                avg2 = (sum-prevSum)/(nums.length-(i+1));
            }
            long ans = Math.abs(avg1-avg2);
            if(ans<mini){
                mini=ans;
                minIdx=i;
            }
        }
        
        return minIdx;
        
    }
}