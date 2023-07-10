class Solution {
    int[] arr;
    HashSet<Integer> set;
    Random rand;
    int[] prev;
    public Solution(int[] nums) {
        arr=new int[nums.length];
        set=new HashSet<>();
        prev= nums;
        rand= new Random();
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            
            set.add(nums[i]);
        }
        
        
    }
    
    public int[] reset() {
        return prev;
    }
    
    public int[] shuffle() {
        int[] vis= new int[arr.length];
        Arrays.fill(vis,Integer.MIN_VALUE);
        for(int i=0;i<arr.length;){
            int j= rand.nextInt(arr.length);
            if(vis[j]==Integer.MIN_VALUE){
                arr[j]=prev[i];
                vis[j]=prev[i];
                i++;
            }
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */