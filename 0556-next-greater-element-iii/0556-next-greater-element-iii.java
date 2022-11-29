class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = (Integer.toString(n)).toCharArray();
        int i=arr.length-2;
        StringBuilder sb= new StringBuilder();
        while(i>=0 && arr[i]>=arr[i+1]) i--;
        
        if(i==-1) return -1;
        int k=arr.length-1;
        while(arr[k]<=arr[i]) k--;
        swap(arr,i,k);
        
        for(int j=0;j<=i;j++) sb.append(arr[j]);
        for(int j=arr.length-1;j>i;j--) sb.append(arr[j]);
        
        long ans=Long.parseLong(sb.toString());
        
        return  (ans>Integer.MAX_VALUE)? -1 : (int)ans;
    
    }
    public void swap(char[] arr, int i, int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}