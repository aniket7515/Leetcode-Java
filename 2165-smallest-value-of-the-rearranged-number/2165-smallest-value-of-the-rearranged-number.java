class Solution {
    public long smallestNumber(long num) {
        if(num==0) return 0;
        boolean isNeg=(num<0);
        
       
        
        if(isNeg){
            num=-num;
            // String s=num+"";
            char[] arr=String.valueOf(num).toCharArray();
            Arrays.sort(arr);
            reverse(arr);
            long ans=-Long.parseLong(new String(arr));
            return ans;
            
        }else{
            // String s=num+"";
            char[] arr=String.valueOf(num).toCharArray();
            Arrays.sort(arr);
            if(arr[0]=='0'){
                int i = 0;
			
            for(; i < arr.length; i++){
                if(arr[i] != '0'){
                    break;
                }
            }
                char temp=arr[i];
                arr[i]=arr[0];
                arr[0]=temp;
                
            }
            long ans=Long.parseLong(new String(arr));
            return ans;
        }
        
        
    }
    public void reverse(char[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
}