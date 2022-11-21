class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boatCnt=0;
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum<=limit){
                boatCnt++;
                i++;
                j--;
            }else if(sum>limit){
                j--;
                boatCnt++;
            }
        }
        return boatCnt;
    }
}