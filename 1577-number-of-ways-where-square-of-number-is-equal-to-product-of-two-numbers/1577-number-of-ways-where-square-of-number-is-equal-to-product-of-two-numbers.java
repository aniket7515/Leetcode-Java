class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        if(nums1.length<=1 || nums2.length<=1) return 0;
       return calculate(nums1,nums2)+calculate(nums2,nums1);
    }
    public int calculate(int[] nums1,int[] nums2){
        int ans=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i]*nums1[i],map.getOrDefault(nums1[i]*nums1[i],0)+1);
        }
        for(int j=0;j<nums2.length;j++){
            for(int k=j+1;k<nums2.length;k++){
                ans+=map.getOrDefault(nums2[j]*nums2[k],0);
            }
        }
        return ans;
    }
}