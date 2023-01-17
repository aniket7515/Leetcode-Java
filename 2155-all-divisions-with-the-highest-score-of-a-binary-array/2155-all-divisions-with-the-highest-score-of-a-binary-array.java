class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        
        int noOfOnes=0;
        for(int i:nums){
            if(i==1) noOfOnes++;
        }
        int leftScore=0;
        int rightScore=noOfOnes;
        List<Integer> ans= new ArrayList<>();
        ans.add(0);
        int max=leftScore+rightScore;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                leftScore++;
            }if(nums[i]==1){
                rightScore--;
            }
            int sum=leftScore+rightScore;
            if(sum>max){
                ans= new ArrayList<>();
                ans.add(i+1);
                max=sum;
            }
            else if(sum==max){
                ans.add(i+1);
            }
        }
        return ans;
    }
}