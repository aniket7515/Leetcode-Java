class Solution {
    public int minMaxDifference(int num) {
        char x[]=String.valueOf(num).toCharArray();
        char y[]=String.valueOf(num).toCharArray();
        char p=x[0],q=x[0];
        for(int i=0;i<x.length;i++)
        {
            if(x[i]!='9')
            {
                p=x[i];
                break;
            }
        }
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==p)
            {
                x[i]='9';
            }
        }
        for(int i=0;i<x.length;i++)
        {
            if(y[i]==q)
            {
                y[i]='0';
            }
        }
        return Integer.parseInt(String.valueOf(x)) - Integer.parseInt(String.valueOf(y));
//         String s=num+"";
//         int i=0;
//         StringBuilder sb1=new StringBuilder();
//         if(s.charAt(0)!='9'){
//             char a=s.charAt(i);
//             for(i=0;i<s.length();i++){
//               if(s.charAt(i)==a) sb1.append('9');
//               else sb1.append(s.charAt(i));
//             }
//         }
//         else{
//             i=0;
//             while(i<s.length() && s.charAt(i)!='0'){
//             i++;
//             }
//             if(i<s.length()){
//                  char a=s.charAt(i);
//                 for(i=0;i<s.length();i++){
//                     if(s.charAt(i)==a) sb1.append('9');
//                     else sb1.append(s.charAt(i));
//                 }
//             }
//             else sb1.append(s);
            
//         }
        
//         StringBuilder sb2= new StringBuilder();
//         int j=0;
//         if(s.charAt(0)!='0'){
//             char b=s.charAt(0);
//             for(i=0;i<s.length();i++){
//                 if(s.charAt(i)==b) sb2.append('0');
//                 else sb2.append(s.charAt(i));
//             }
//         }
//         else{
//             while(j<s.length() && s.charAt(j)!='0'){
//             j++;
//             }
//              char b=s.charAt(0);
//             for(i=0;i<s.length();i++){
//                 if(s.charAt(i)==b) sb2.append('0');
//                 else sb2.append(s.charAt(i));
//             }
//         }
//         System.out.println(sb1.toString());
//         System.out.println(sb2.toString());
//         int diff=(Integer.parseInt(sb1.toString())-Integer.parseInt(sb2.toString()));
//         return diff;
    }
}