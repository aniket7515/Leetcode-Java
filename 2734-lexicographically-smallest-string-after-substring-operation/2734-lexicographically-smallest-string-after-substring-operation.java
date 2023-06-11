class Solution {
    public String smallestString(String s) {
        
        char[] arr=s.toCharArray();
        int i=0;
        int n=s.length();
        
        while(i<n && arr[i]=='a'){
            i++;
            
            
            
        }
    if(i==n){
        arr[n-1]='z';
        return new String(arr);
    } 
    while(i<n ){
        if(arr[i]!='a')arr[i]= (char)(arr[i] - 1);
        else break;
        i++;
    }
    return new String(arr);
        
    }
       
}