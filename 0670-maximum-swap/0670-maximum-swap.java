class Solution {
    public int maximumSwap(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int[] lastIdx=new int[10];
        for(int i=0;i<arr.length;i++){
            lastIdx[arr[i]-'0']=i;
        }
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            int digit=arr[i]-'0';
            for(int j=9;j>digit;j--){
                if(i<lastIdx[j]){
                    char temp=arr[i];
                    arr[i]=arr[lastIdx[j]];
                    arr[lastIdx[j]]=temp;
                    flag=true;
                    break;
                }
            }
            if(flag) break;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return Integer.parseInt(sb.toString());
        
        
    }
   
}