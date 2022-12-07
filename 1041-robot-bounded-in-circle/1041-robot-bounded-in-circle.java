class Solution {

    class Location{
        int x;
        int y;
        public Location(int x,int y){
            this.x=x;
            this.y=y;
        }
        public String toString(){
            return this.x+""+this.y;
        }
    }

    public boolean isRobotBounded(String instructions) {
        Map<String,Location> locationMap = new HashMap<>();
        locationMap.put("North",new Location(0,1));
        locationMap.put("South",new Location(0,-1));
        locationMap.put("East",new Location(1,0));
        locationMap.put("West",new Location(-1,0));

        Map<String,ArrayList<String>> directionMap= new HashMap<>();
        directionMap.put("North",new ArrayList(Arrays.asList("West","East")));
        directionMap.put("South",new ArrayList(Arrays.asList("East","West")));
        directionMap.put("East",new ArrayList(Arrays.asList("North","South")));
        directionMap.put("West",new ArrayList(Arrays.asList("South","North")));

        String currentLocDir="North";
        Location currentLoc=new Location(0,0);
        for(int i=0;i<instructions.length();i++){
            char ch=instructions.charAt(i);
            if(ch=='G'){
                currentLoc.x=currentLoc.x+ locationMap.get(currentLocDir).x;
                currentLoc.y=currentLoc.y+ locationMap.get(currentLocDir).y;
            }else if(ch=='L') currentLocDir=directionMap.get(currentLocDir).get(0);
            else{
                currentLocDir=directionMap.get(currentLocDir).get(1);
            }
        }
        if(currentLoc.x==0 && currentLoc.y==0) return true;
        else if(!currentLocDir.equals("North")) return true;
        else return false;

    }
}