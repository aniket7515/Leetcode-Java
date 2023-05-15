class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] a= s1.toCharArray();
        char[] b= s2.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int cnt1=0;
        int cnt2=0;
        
        int i=0;
        int j=0;
        
        boolean a1= check(a,b);
        boolean b1= check(b,a);
        
        return (a1 || b1 );
        
        
    }
    public boolean check(char[] a, char[] b){
        for(int i=0;i<a.length;i++){
            if(a[i]>=b[i]) continue;
            if(a[i]<b[i]) return false;
        }
        return true;
    }
}