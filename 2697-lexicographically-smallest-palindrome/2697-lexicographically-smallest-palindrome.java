class Solution {
    public String makeSmallestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();
        while(i<j){
            
            
            if(arr[i]!=arr[j]){
                if((arr[i]-'a')<(arr[j]-'a')){
                    arr[j]=arr[i];
                }else{
                    arr[i]=arr[j];
                }
            }
            
            i++;
            j--;
        }
        StringBuilder sb= new StringBuilder();
        for(i=0;i<arr.length;i++) sb.append(arr[i]);
        
        return sb.toString();
    }
}