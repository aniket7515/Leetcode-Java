class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(i!=0 &&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-1;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                long sum = (long)target-nums[i]-nums[j];
                int start=j+1;
                int end=nums.length-1;
                while(start<end){
                    int mid= start + (end-start)/2;
                    if((nums[start]+nums[end])==sum){
                        Integer[] temp= {nums[i],nums[j],nums[start],nums[end]};
                        ans.add(Arrays.asList(temp));
                        start++;
                        end--;
                        while( start<nums.length&&nums[start]==nums[start-1]) start++;
                    while(end>=0 && nums[end]==nums[end+1]) end--;
                    }
                    
                    else if((nums[start]+nums[end])<sum) start++;
                    else end--;
                }
            }
        }
        return ans;
        
        
        
        
        
//         List<List<Integer>> ans= new ArrayList<>();
        
//         if(nums==null || nums.length==0) return ans;
//         int n=nums.length;
//         Arrays.sort(nums);
        
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<n;j++){
//                 int target_2=target-nums[j]-nums[i];
//                 int left=j+1;
//                 int right=n-1;
                
//                 while(left<right){
//                     int two_sum=nums[left]+nums[right];
//                     if(two_sum<target_2) left++;
//                     else if(two_sum>target_2) right--;
//                     else{
//                         List<Integer> quad=new ArrayList<>();
//                         quad.add(nums[i]);
//                         quad.add(nums[j]);
//                         quad.add(nums[nums[left]]);
//                         quad.add(nums[nums[right]]);
//                         ans.add(quad);
                        
//                         while(left<right && nums[left]==quad.get(2) ){
//                             ++left;
//                         }
//                         while(left<right && nums[right]==quad.get(3)){
//                             --right;
//                         }
                        
//                     }
//                 }
//                 while(j+1<n && nums[j+1]==nums[j]) j++;
//             }
//             while(i+1<n && nums[i+1]==nums[i]) i++;
//         }
        
        
//         return ans;
    }
}