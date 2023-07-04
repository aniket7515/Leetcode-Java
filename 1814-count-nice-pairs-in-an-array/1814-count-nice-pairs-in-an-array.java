class Solution {
    public int countNicePairs(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]-= rev(nums[i]);
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ans=(ans%1000000007+map.get(nums[i])%1000000007)%1000000007;
                map.put(nums[i], map.get(nums[i])+1);
            } 
            else{
                map.put(nums[i],1);
            }
        }
        return ans;
    }
//     public int rev(int a){
//         StringBuilder sb= new StringBuilder();
        
//         sb.append(a+"");
//         sb.reverse();
        
//         return Integer.parseInt(sb.toString());
        
//     }
    private long rev(int num){
        long rev=0;
        while(num!=0){
            rev=rev*10 + num%10;
            num/=10;
        }
        return rev;
    }
}