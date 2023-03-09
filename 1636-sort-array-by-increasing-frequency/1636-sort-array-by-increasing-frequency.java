class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Collections.sort(arr, (a,b)-> (map.get(a)==map.get(b))?b-a:(map.get(a)-map.get(b)));
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return nums;
        
    }
}