class Solution {
    
    public int maximumSum(int[] nums) {
        // Arrays.sort(nums,(a,b)-> count(a)-count(b));
        
        // List<Pair> arr= new ArrayList<>();
        // int max=-1;
        // for(int i=0;i<nums.length-1;i++){
        //     if((count(nums[i]))== (count(nums[i+1]))){
        //         arr.add(new Pair(nums[i],nums[i+1]));
        //         max=Math.max(max,(nums[i]+nums[i+1]));
        //     }
        // }
        // return max;
        int ans=-1;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cnt=count(nums[i]);
            if(!map.containsKey(cnt)){
                map.put(cnt,nums[i]);
            }else{
                ans=Math.max(ans, map.get(cnt)+nums[i]);
                map.put(cnt, Math.max(nums[i],map.get(cnt)));
            }
        }
        
        return ans;
        
        
        
        
        
    }
    public int count(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }
}