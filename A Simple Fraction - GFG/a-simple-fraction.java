//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int numerator = Integer.parseInt(S[0]);
            int denominator = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            String ans = ob.fractionToDecimal(numerator, denominator);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String  fractionToDecimal(int numerator, int denominator)
    {
        // code here
        int quo=numerator/denominator;
        int rem= numerator%denominator;
        
        String ans="";
        ans+=quo;
        int nume=rem;
        if(rem==0) return ans;
        
        
        
        String frac="";
        HashMap<Integer,Integer>  map= new HashMap<>();
        
        while(nume!=0 && !map.containsKey(nume)){
            map.put(nume,frac.length());
            
            nume*=10;
            quo= nume/denominator;
            rem=nume%denominator;
            frac+=quo;
            nume=rem;
        }
        
        if(nume==0) return ans+"."+frac;
        else{
            int idx= map.get(nume);
            return ans+"."+frac.substring(0,idx)+"("+frac.substring(idx)+")";
        }
        
    }
}