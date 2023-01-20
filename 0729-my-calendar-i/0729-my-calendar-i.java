class MyCalendar {
    TreeMap<Integer,Integer> map;
    public MyCalendar() {
        map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        if(map.floorEntry(start)!=null && start<map.floorEntry(start).getValue()) return false;
        if(map.ceilingEntry(start)!=null && end>map.ceilingEntry(start).getKey()) return false;
        map.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */