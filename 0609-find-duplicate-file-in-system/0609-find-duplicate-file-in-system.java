class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> ans= new ArrayList<>();
        HashMap<String,List<String>> map= new HashMap<>();
        
        for(String s:paths){
            String[] dir=s.split(" ");
            String root=dir[0];
            for(int i=1;i<dir.length;i++){
                String content=dir[i].substring(dir[i].indexOf("("),dir[i].indexOf(")"));
                String val=root+"/"+dir[i].substring(0,dir[i].indexOf("("));
                
                if(!map.containsKey(content)){
                    map.put(content,new ArrayList<>());
                   
                }
               
                 map.get(content).add(val);
            }
        }
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            if(entry.getValue().size()>1) ans.add(entry.getValue());
        }
        
        return ans;
    }
}