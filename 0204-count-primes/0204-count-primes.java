class Solution {
    public int countPrimes(int n) {
        boolean[] primes= new boolean[n+1];
        Arrays.fill(primes,true);
        int res=0;
        for(int i=2;i<=n;i++){
            for(int j=2*i;j<=n;j+=i) primes[j]=false;       
        }
        for(int i=2;i<n;i++){
            if(primes[i]==true) res++;
        }
        
        return res;
   
    }
}