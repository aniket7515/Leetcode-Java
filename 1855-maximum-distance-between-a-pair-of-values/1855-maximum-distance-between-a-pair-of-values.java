class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        
        int i=0;
        int j=0;
        int max=0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]) i++;
            else {
                max=Math.max(max,j-i);
                j++;
            }
        }
        return max;
        
        
        
        
//         int max=0;
//         for(int i=0;i<nums1.length;i++){
            
//         
            
//             // for(int j=i;j<nums2.length;j++){
//             //     if(i<=j && nums1[i]<=nums2[j]) max=Math.max(max,j-i);
//             // }
//         }
//         return max;
    }
}