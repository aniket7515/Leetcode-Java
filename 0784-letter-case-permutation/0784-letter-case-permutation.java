class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans= new ArrayList<>();
        func(0,s.toCharArray(),ans);
        return ans;
    }
    public void func(int ind, char[] arr, List<String> ans){
        if(ind==arr.length){
            ans.add(new String(arr));
            return;
        }
        if(Character.isDigit(arr[ind])){
            func(ind+1,arr,ans);
            return;
        }
        arr[ind]=Character.toLowerCase(arr[ind]);
        func(ind+1,arr,ans);
        
        arr[ind]=Character.toUpperCase(arr[ind]);
        func(ind+1,arr,ans);
        
    }
}