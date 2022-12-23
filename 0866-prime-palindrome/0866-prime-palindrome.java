class Solution {
    public int primePalindrome(int n) {
        while(true)
       {
            if(isPalindrome(Integer.toString(n)) && isPrime(n))
            {
                return n;
            }
            n++;
            if (n > 10000000  && n < 100000000)
            {
                n = 100000001;
            }
       }  
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
    public boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i < n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}