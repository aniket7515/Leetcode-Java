class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans= new ArrayList<>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set1= new HashSet<>();
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(func(nums2,nums1[i])==false && !set1.contains(nums1[i])){
                arr.add(nums1[i]);
                set1.add(nums1[i]);
            } 
        }
        ans.add(arr);
        set1= new HashSet<>();
        arr= new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(func(nums1,nums2[i])==false  && !set1.contains(nums2[i])){
                arr.add(nums2[i]);
                set1.add(nums2[i]);
            } 
        }
        ans.add(arr);
        return ans;
        
        
    }
    public boolean func(int[] nums, int target){
        int i=0;
        int j=nums.length-1;
        
        while(i<=j){
            int mid=(i+(j-i)/2);
            
            if(nums[mid]==target) return true;
            if(nums[mid]>target) j=mid-1;
            else if(nums[mid]<target) i=mid+1;
            
        }
        return false;
    }
}