class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr= new ArrayList<>();
        List<Integer> a= new ArrayList<>();
        func(arr,a,nums);
        return arr;
    }
    public void func(List<List<Integer>> arr, List<Integer> list, int[] nums){
        if(list.size()==nums.length){
            arr.add(new ArrayList<>(list));
            return;
        }
        else{
        for(int i=0;i<nums.length;i++){
            
            
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
               func(arr,list,nums);
               list.remove(list.size()-1);
               
        }
               }
    }
}