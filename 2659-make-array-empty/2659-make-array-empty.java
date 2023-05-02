class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        long sum=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(map.get(nums[i])<map.get(nums[i-1])){
                sum+=nums.length-i;
            }
        }
        return sum;
        
        
//         long sum=0;
        
//         PriorityQueue<Integer> pq= new PriorityQueue<>();
//         List<Integer> arr= new ArrayList<>();
//         for(int i:nums){
//             pq.add(i);
//             arr.add(i);
//         } 
        
//         int cnt=0;
        
//         while(arr.size()!=0){
//             // int a=pq.poll();
//             if(arr.get(0)==pq.peek()){
//                 arr.remove(0);
//                 pq.poll();
               
//             }
//             else{
//                 int m=arr.remove(0);
//                 arr.add(arr.size()-1,m);
                
               
//             }
//             cnt++;
//         }
        
//         return cnt;
        
        
        
        
        
    }
}