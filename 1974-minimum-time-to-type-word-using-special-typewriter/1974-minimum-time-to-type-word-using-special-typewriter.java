class Solution {
    public int minTimeToType(String word) {
        char prevChar='a';
        int totalTime=word.length();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int diff= Math.abs(ch-prevChar);
            totalTime+= Math.min(diff,26-diff);
            prevChar=ch;
        }
        return totalTime;
    }
}