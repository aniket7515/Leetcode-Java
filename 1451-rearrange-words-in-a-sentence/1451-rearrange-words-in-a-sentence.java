class Solution {
    public String arrangeWords(String text) {
        String[] arr= text.split(" ");
        Arrays.sort(arr,(a,b)-> a.length()-b.length());
        
        String first="";
        for(int i=0;i<arr[0].length();i++){
            if(i==0) first+=(arr[0].charAt(0)+"").toUpperCase();
            else{
                first+=arr[0].charAt(i);
            }
        }
        arr[0]=first;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i].toLowerCase();
        }
        
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        
        String ans=sb.toString();
        
        return ans.trim();
    }
}