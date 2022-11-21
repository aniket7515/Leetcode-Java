class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelf(i)) ans.add(i);
        }
        return ans;
    }
    public boolean isSelf(int num){
        int a=num;
        while(num>0){
            int rem=num%10;
            if(rem==0) return false;
            if(a%rem!=0) return false;
            num=num/10;
        }
        return true;
    }
}