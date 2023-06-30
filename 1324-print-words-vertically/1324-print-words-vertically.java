class Solution {
    public List<String> printVertically(String s) {
        String[] arr= s.split(" ");
        int max=0;
        for(String s1:arr) max=Math.max(max,s1.length());
        List<String> ans= new ArrayList<>();
        for(int i=0;i<max;i++){
            String str="", space="";
            for(int j=0;j<arr.length;j++){
                if(i>=arr[j].length()) space+=" ";
                else{
                    str= str+space+arr[j].charAt(i);
                    space="";
                }
            }
            ans.add(str);
        }
        return ans;
    }
}