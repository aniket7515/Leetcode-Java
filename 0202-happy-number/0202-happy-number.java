class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s= new HashSet<>();
    
            
            while(n!=1){
                int current=n;
                int sum=0;
                
                while(current!=0){
                    int rem=current%10;
                    sum+=rem*rem;
                    current=current/10;
                }
                if(s.contains(sum)){
                    return false;
                }
                n=sum;
                s.add(n);
            }return true;
    }
}