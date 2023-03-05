class Solution {
    public int integerReplacement(int n) {
        return func((long)n);
    }
    public int func(long n){
        int ans=0;
        if(n<=1) return 0;
        if(n%2==0){
            ans=1+func(n/2);
        }else{
            ans=1+Math.min(func(n-1),func(n+1));
        }
        return ans;
    }
}