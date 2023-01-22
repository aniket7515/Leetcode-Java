class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res= new ArrayList<>();
        int len=s.length();
        
        StringBuilder sb= new StringBuilder();
        for(int aLen=1;aLen<=3;aLen++){
            for(int bLen=1;bLen<=3;bLen++){
                for(int cLen=1;cLen<=3;cLen++){
                    int dlen=len-aLen-bLen-cLen;
                    if(dlen>0 && dlen<=3 && aLen+bLen+cLen+dlen==len){
                        int A=Integer.parseInt(s.substring(0,aLen));
                        int B=Integer.parseInt(s.substring(aLen,aLen+bLen));
                        int C=Integer.parseInt(s.substring(aLen+bLen,aLen+bLen+cLen));
                        int D=Integer.parseInt(s.substring(aLen+bLen+cLen));
                        
                        if(A<=255 && B<=255 && C<=255 && D<=255){
                            sb.append(A).append(".").append(B).append(".").append(C).append(".").append(D);
                            if(sb.length()==len+3) res.add(sb.toString());
                            sb= new StringBuilder();
                        }
                    }
                }
            }
        }
        
        return res;
        
    }
}