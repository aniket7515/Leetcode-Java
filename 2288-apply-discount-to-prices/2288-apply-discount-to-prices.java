class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] strList= sentence.split(" ");
        String ans="";
        for(int i=0;i<strList.length;i++){
            if(isValid(strList[i])){
                long val=Long.parseLong(strList[i].substring(1));
                ans+=("$"+String.format("%.2f",val*(1-discount/100.0d)));
            }else{
                ans+=strList[i];
            }
            ans+=" ";
        }
        
        return ans.trim();
        
    }
    public boolean isValid(String s){
        if(s.length()<=1) return false;
        if(s.charAt(0)!='$') return false;
        for(int i=1;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))) return false;
        }
        
        return true;
        
    }
}