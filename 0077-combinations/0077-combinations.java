class Solution {
    HashSet<List<Integer>> set= new HashSet<>();
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> a= new ArrayList<>();
        func(ans,a,n,k,1);
        return ans;
    }
    public void func(List<List<Integer>> arr, List<Integer> a, int n, int k, int start){
        if(k==0){
           
            arr.add(new ArrayList<>(a));
           
            return;
        }
        for(int i=start;i<=n;i++){
            
            a.add(i);
            func(arr,a,n,k-1,i+1);
            a.remove(a.size()-1);
        }
    }
}