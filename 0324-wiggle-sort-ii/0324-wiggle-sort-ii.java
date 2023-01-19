class Solution {
    public void wiggleSort(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i]=nums[i];
        Arrays.sort(arr);
        // int i=0;
        int n=arr.length-1;
        int k=0;
        for(int i=1;i<nums.length;i+=2) nums[i]=arr[n--];
        for(int i=0;i<nums.length;i+=2) nums[i]=arr[n--];
        // while(i<j){
        //     nums[k]=arr[i];
        //     k++;
        //     nums[k]=arr[j];
        //     k++;
        //     i++;
        //     j--;
        // }
    }
}