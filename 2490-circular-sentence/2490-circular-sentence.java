class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        if(arr.length==1){
            if(arr[0].charAt(0)!=arr[0].charAt(arr[0].length()-1)) return false;
            return true;
        }
        
        String last=arr[arr.length-1];
        if(last.charAt(last.length()-1)!=arr[0].charAt(0)) return false;
        String first=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].charAt(0)!=first.charAt(first.length()-1)) return false;
            first=arr[i];
        }
        return true;
        
        
    }
}