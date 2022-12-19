class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long count=0;
        for(int i=0;i<arr.length;i++){
            int new_target=target-arr[i];
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int j=i+1;j<arr.length;j++){
                if(map.get(new_target-arr[j])!=null){
                    count+=map.get(new_target-arr[j]);
                }
                if(map.get(arr[j])!=null){
                    map.put(arr[j],map.get(arr[j])+1);
                }else{
                    map.put(arr[j],1);
                }
            }
        }
        return (int)(count%1000000007);
    }
}