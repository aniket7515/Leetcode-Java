class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;
        int ans=1;
        int number=1;
        while(number%k!=0){
            number=(number*10+1)%k;
            ans++;
        }
        return ans;
    }
}