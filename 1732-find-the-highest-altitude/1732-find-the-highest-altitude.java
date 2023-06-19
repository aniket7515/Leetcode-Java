class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr= new int[gain.length];
        arr[0]=gain[0];
        int max=Math.max(0,arr[0]);
        for(int i=1;i<arr.length;i++){
            arr[i]= (arr[i-1]+gain[i]);
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}