class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set= new HashSet<>();
        for(int i:candyType) set.add(i);
        int n=candyType.length;
        
        return Math.min(n/2,set.size());
    }
}