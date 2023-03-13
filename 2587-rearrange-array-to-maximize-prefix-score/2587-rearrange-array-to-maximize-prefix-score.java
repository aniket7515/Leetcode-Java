class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        
        long[] pre=new long[nums.length];
        pre[0]=nums[0];
        for( i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        
        int count=0;
        for( i=0;i<pre.length;i++){
            if(pre[i]>0) count++;
        }
        
        return count;
        
        
        
        
        
        
    }
}