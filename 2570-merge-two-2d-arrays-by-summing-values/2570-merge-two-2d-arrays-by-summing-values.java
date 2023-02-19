class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i][0])){
                map.put(nums1[i][0],nums1[i][1]);
            }else{
                map.put(nums1[i][0],map.get(nums1[i][0])+nums1[i][1]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!map.containsKey(nums2[i][0])){
                map.put(nums2[i][0],nums2[i][1]);
            }else{
                map.put(nums2[i][0],map.get(nums2[i][0])+nums2[i][1]);
            }
        }
        
        List<List<Integer>> ans= new ArrayList<>();
        
//         for(Map.Entry<Integer,Integer> entry: map.entrySet()){
//             List<Integer> arr= new ArrayList<>();
//             arr.add(entry.getkey());
//             arr.add(entry.getValue());
//             ans.add(arr);
//         }
        for(int key:map.keySet()){
            List<Integer> arr= new ArrayList<>();
            int val=map.get(key);
            arr.add(key);
            arr.add(val);
            ans.add(arr);
        }
        int[][] res= new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i][0]=ans.get(i).get(0);
            res[i][1]=ans.get(i).get(1);
        }
        Arrays.sort(res,(a,b)->a[0]-b[0]);
        
        return res;
        
        
    }
}