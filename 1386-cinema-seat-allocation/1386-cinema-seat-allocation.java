class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        // List<List<Integer>> arr= new ArrayList<>();
        HashMap<Integer,List<Integer>> map= new HashMap<>();
        
        for(int[] r:reservedSeats){
            if(map.containsKey(r[0])){
                map.get(r[0]).add(r[1]);
            }
            else{
                map.put(r[0],new ArrayList<>());
                map.get(r[0]).add(r[1]);
            }
        }
        int cnt=(n-map.size())*2;
        for(Integer arr : map.keySet()){
            boolean left= true;
            boolean middle=true;
            boolean right=true;
            List<Integer> a=map.get(arr);
            for(int i=0;i<a.size();i++){
                if(a.get(i)>=2 && a.get(i)<=5) left=false;
                if(a.get(i)>=4 && a.get(i)<=7) middle=false;
                if(a.get(i)>=6 && a.get(i)<=9) right=false;
                
            }
            if(left && right) cnt+=2;
            else if(left || right || middle) cnt+=1;
        }
        return cnt;
    }
}