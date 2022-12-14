class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        if(a.length()==1 && b.length()==1) return true;
        return (solve(a,b) || solve(b,a));
    }
    public boolean isPalindrome(String a){
        int i=0;
        int j=a.length()-1;
        while(i<=j){
            if(a.charAt(i)!=a.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean solve(String a, String b){
        int i=0;
        int j=b.length()-1;
        while(i<j &&  a.charAt(i)==b.charAt(j)){
            i++;
            j--;
        }
        if(i>=j) return true;
        
        return (isPalindrome(a.substring(i,j+1)) || isPalindrome(b.substring(i,j+1)));
        
    }
}