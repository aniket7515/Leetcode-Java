class Solution {
    public String sortSentence(String s) {
        String []res=new String[s.split(" ").length];
        for(String st:s.split(" ")){
            res[st.charAt(st.length()-1)-'1']=st.substring(0,st.length()-1);
        }
        StringBuilder sb= new StringBuilder();
        for(String i:res){
            sb.append(i);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}