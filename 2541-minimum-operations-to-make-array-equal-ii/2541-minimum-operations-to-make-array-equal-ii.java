class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        if (k == 0) {
            return Arrays.equals(nums1, nums2) ? 0 : -1;
        }
        long ans=0;
        List<Integer> arr=new ArrayList<>();
        int sum=0;
        int max=nums1[0];
        for(int i=0;i<nums1.length;i++){
           
            int diff=(nums1[i]-nums2[i]);
            sum+=diff;
            arr.add(diff);
        }
        
       
        if(sum==0){
            
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)>0){
                    ans+=arr.get(i);
                }
            }
            if(k!=0 && ans%k==0) return (long)ans/k;
            else return -1;
        }
        return -1;
    }
}