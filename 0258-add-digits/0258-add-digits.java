class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int n=num;
            int sum=0;
            while(n!=0){
                
                int rem=n%10;
                sum+=rem;
                n=n/10;
                
            }
            num=sum;
        }
        return num;
    }
}