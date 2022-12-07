class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                map.put((nums[i]*nums[j]),map.getOrDefault((nums[i]*nums[j]),0)+1);
            }
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int freq=entry.getValue();
            sum+=((freq*(freq-1))*4);
        }
        return sum;
    }
}