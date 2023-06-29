class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] dp= new int[nums.length+1];
        Arrays.fill(dp,-1);
        List<Integer> ans= new ArrayList<>();
        func(nums,0,ans,new ArrayList<>(),1,dp);
        return ans;
    }
    public void func(int[] nums, int ind, List<Integer> ans, List<Integer> curr, int prev, int[] dp){
        if(ind>= nums.length){
            if(curr.size()>ans.size()){
                ans.clear();
                ans.addAll(curr);
            }
            return;
        }
        if( dp[ind]<curr.size() && (prev%nums[ind]==0 || nums[ind]%prev==0)){
            dp[ind]=curr.size();
            curr.add(nums[ind]);
            func(nums,ind+1,ans,curr,nums[ind],dp);
            curr.remove(curr.size()-1);
        }
        func(nums,ind+1,ans,curr,prev,dp);
        
        
    }
}