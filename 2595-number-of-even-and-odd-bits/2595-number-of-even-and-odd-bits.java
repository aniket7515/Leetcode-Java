class Solution {
    public int[] evenOddBit(int n) {
         String bString = Integer.toBinaryString(n);
         StringBuilder sb=new StringBuilder(bString);
        sb.reverse();
        String s = sb.toString();
        int odd=0,even=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                if(i%2==0) even++;
                else
                    odd++;
            }
        }
        int a[] = new int[2];
        a[0]=even;
        a[1]=odd;
        return a;
    }
    
}