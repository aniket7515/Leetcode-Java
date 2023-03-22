class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> arr= new ArrayList<>();
        Arrays.sort(nums);
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            
            arr.add(nums[i]);
        }
        Collections.sort(arr);
        if(arr.size()<3) return arr.get(arr.size()-1);
        
        return arr.get(arr.size()-3);
        
        
    }
}