class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int i=0;
        int[] ans=new int[nums.length];
        while(pq.isEmpty()==false){
            ans[i]=pq.poll();
            i++;
        }
        
        return ans;
        
        
    }
}