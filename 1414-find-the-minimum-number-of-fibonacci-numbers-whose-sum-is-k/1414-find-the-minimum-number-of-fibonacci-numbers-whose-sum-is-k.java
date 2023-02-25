class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> arr= new ArrayList<>();
        int n1=1;
        int n2=2;
        int num=0;
        int count=0;
        
        arr.add(1);
        arr.add(2);
        while(num<k){
            num=n1+n2;
            n1=n2;
            n2=num;
            arr.add(num);
        }
        
        int i=arr.size()-1;
        
        while(k>0){
            if(k<arr.get(i)) i--;
            else if(num==arr.get(i) || num>arr.get(i)){
                count++;
                k-=arr.get(i);
            }
        }
        return count;
        
    }
   
}