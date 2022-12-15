class Solution {
    public String maxValue(String n, int x) {
        StringBuilder sb= new StringBuilder(n);
        int index=n.indexOf("-");
        
        if(index==-1){
            int i=0;
            while(i<n.length()){
                int num=n.charAt(i)-'0';
                if(num<x) break;
                i++;
            }
            sb.insert(i,x);
        }
        else{
            int i=1;
            while(i<n.length()){
                int num=n.charAt(i)-'0';
                if(num>x) break;
                i++;
            }
            sb.insert(i,x);
        }
        return sb.toString();
    }
}