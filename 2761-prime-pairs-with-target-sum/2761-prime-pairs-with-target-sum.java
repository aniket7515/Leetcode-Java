class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        
        List<List<Integer>> ans= new ArrayList<>();
        // if(n==2 || n==3) return ans;
        // HashSet<Integer> set= new HashSet<>();
        for(int i=2;i<=n/2;i++){
            
            List<Integer> arr= new ArrayList<>();
            if(isPrime(i) && isPrime(n-i)){
                arr.add(i);
                arr.add(n-i);
                ans.add(arr);
                // set.add(i);
                // set.add(n-i);
            }
            // if(arr.size()==2) ans.add(arr);
            
        }
        return ans;
        
        
    }
    public boolean isPrime(int n){
        if(n<=1)
            return false;
        if(n==2||n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
}