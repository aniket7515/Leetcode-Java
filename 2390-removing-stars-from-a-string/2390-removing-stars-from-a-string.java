class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0)!='*') stack.push(s.charAt(0));
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!='*') stack.push(s.charAt(i));
            else if(s.charAt(i)=='*' && s.isEmpty()==false) stack.pop(); 
            // else if(s.isEmpty()==true) return "";
        }
        if(stack.isEmpty()) return "";
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        
        ans=ans.reverse();
        return ans.toString();
        
        
        
    }
}