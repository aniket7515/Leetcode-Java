class Solution {
    public int longestSubsequence(int[] nums, int diff) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-diff)) map.put(nums[i], map.get(nums[i]-diff)+1);
            else map.put(nums[i],1);
            
            max=Math.max(max,map.get(nums[i]));
        }
        return max;
        
        
        
        // int[][] dp = new int[arr.length][10001];
        // return func(arr,0,difference,-10000);
    }
//     public int func(int[] arr, int ind, int diff, int prev){
//         if(ind==arr.length) return 0;
//         int take=0;
//         int notTake=0;
//         if(prev==-10000){
//             notTake= func(arr,ind+1,diff, prev);
//                 take = 1+func(arr,ind+1,diff,arr[ind]);
            
//         }
//         else{
//             notTake= func(arr,ind+1,diff, prev);
            
//             if((arr[ind]-prev)==diff){
//                 take = 1+func(arr,ind+1,diff,arr[ind]);
//             }
//         }
//         return Math.max(take,notTake);
//     }
}