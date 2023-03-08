class Solution {
    public int splitNum(int num) {
        String s=num+"";
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String num1="";
        String num2="";
        
        for(int i=0;i<s.length();i++){
            if(i%2==0) num1+=arr[i];
            else num2+=arr[i];
        }
        System.out.println(num1+"+"+num2);
        return (Integer.parseInt(num1)+Integer.parseInt(num2));
        
    }
}