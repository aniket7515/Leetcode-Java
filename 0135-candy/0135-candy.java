class Solution {
    public int candy(int[] rating) {
        int[] arr= new int[rating.length];
        
        Arrays.fill(arr,1);
        
        for(int i=1;i<rating.length;i++){
            if(rating[i]>rating[i-1]) arr[i]=(arr[i-1]+1 );
            
        }
        for(int i=rating.length-2;i>=0;i--){
            if(rating[i]>rating[i+1] && arr[i]<=arr[i+1]) arr[i]=(arr[i+1]+1);
        }
        
        int sum=0;
        for(int i:arr) sum+=i;
        return sum;
        
    }
}