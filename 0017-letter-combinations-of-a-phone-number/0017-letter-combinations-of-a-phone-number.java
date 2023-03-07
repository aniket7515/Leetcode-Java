class Solution {
    public List<String> letterCombinations(String digits) {
        String[] arr= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res= new ArrayList<>();
        if(digits.length()==0) return res;
        res.add("");
        
        for(int i=0;i<digits.length();i++){
            res=combine(arr[digits.charAt(i)-'0'],res);
        }
        return res;
        
    }
    public List<String> combine(String digit, List<String> res){
        List<String> result= new ArrayList<>();
        for(int i=0;i<digit.length();i++){
            for(String x:res){
                result.add(x+digit.charAt(i));
            }
        }
        return result;
    }
}