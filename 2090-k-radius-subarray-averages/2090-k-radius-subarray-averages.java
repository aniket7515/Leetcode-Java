class Solution {
    public int[] getAverages(int[] nums, int k) {
        long[] prefix=new long[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        int[] res= new int[nums.length];
        Arrays.fill(res,-1);
        
        for(int i=k;i<nums.length-k;i++){
            long sum=(prefix[i+k]-prefix[i-k]+nums[i-k])/(2*k+1);
            res[i]=(int)sum;
        }
        return res;
    }
}