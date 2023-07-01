class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    List<Integer> nums= new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        
        
        func(n,k,1);
        return ans;
    }
    public void func(int target, int k, int start){
        
        // if(ind<0 && k==0 && target==0) ans.add(nums);return;
        if(k==0 && target==0){
            List<Integer> li= new ArrayList<>(nums);
            ans.add(li);
            return;
        }
        
       for(int i=start;i<10;i++){
            nums.add(i);
            func(target-i,k-1,i+1);
            nums.remove(nums.size()-1);
        }
        // func(arr,target,k,nums,ans,ind-1);
        
    }
}