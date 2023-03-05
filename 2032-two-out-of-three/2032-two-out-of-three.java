class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> arr= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                for(int k=0;k<nums3.length;k++){
                    if(nums1[i]==nums2[j] && !set.contains(nums1[i])){
                        arr.add(nums1[i]);
                        set.add(nums1[i]);
                    }
                    if(nums2[j]==nums3[k] && !set.contains(nums2[j])){
                        arr.add(nums2[j]);
                        set.add(nums2[j]);
                    }if(nums1[i]==nums3[k] && !set.contains(nums1[i])){
                        arr.add(nums1[i]);
                        set.add(nums1[i]);
                    }
                }
            }
        }
        
        return arr;
    }
}