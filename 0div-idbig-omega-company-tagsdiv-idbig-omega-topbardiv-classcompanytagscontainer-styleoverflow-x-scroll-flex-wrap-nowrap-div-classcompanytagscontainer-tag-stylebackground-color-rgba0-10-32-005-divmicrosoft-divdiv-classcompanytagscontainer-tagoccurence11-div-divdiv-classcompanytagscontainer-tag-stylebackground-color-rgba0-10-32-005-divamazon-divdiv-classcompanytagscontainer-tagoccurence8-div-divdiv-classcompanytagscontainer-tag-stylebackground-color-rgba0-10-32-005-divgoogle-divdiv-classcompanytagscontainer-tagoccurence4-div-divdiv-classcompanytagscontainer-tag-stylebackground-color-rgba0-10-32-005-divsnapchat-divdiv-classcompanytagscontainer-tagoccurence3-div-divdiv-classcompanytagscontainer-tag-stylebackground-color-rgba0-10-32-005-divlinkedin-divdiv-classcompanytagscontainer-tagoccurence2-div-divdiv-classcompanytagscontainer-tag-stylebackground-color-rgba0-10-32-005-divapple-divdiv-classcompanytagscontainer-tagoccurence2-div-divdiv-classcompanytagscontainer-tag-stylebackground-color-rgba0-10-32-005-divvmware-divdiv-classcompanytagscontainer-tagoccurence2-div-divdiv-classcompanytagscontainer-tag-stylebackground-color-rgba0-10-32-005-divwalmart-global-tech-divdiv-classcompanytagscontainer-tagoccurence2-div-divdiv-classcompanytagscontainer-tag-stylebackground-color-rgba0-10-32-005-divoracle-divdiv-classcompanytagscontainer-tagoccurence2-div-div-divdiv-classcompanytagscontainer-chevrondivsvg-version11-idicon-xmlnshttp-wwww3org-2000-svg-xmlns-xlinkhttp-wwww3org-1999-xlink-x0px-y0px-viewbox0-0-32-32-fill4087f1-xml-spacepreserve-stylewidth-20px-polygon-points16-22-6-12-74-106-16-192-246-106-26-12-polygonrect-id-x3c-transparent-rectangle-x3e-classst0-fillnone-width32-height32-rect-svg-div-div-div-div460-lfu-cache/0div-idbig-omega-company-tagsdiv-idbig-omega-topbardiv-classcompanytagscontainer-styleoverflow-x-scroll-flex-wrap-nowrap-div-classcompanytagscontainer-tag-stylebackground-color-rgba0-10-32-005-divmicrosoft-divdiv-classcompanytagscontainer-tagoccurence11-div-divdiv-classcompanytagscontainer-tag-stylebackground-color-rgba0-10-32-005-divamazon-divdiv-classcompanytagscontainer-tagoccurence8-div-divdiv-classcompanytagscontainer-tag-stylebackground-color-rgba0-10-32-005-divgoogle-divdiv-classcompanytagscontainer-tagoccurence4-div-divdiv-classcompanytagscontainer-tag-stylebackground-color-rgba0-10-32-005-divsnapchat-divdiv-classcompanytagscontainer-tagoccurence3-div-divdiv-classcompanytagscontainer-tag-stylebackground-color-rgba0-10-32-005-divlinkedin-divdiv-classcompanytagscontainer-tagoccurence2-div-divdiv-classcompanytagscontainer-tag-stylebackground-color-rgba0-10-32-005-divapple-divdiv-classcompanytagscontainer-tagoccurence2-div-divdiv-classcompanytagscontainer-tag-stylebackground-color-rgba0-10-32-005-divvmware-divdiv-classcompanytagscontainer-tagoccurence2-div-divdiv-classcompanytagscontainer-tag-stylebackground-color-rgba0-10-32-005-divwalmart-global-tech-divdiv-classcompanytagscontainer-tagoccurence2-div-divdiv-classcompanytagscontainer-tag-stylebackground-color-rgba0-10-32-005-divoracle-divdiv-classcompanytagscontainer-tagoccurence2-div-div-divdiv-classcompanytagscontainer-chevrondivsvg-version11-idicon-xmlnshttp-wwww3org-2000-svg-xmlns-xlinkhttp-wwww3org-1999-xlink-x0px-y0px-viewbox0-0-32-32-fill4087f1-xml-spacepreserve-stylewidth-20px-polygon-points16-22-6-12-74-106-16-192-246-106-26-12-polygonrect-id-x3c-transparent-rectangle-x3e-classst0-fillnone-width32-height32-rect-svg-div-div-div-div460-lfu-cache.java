class LFUCache {
    private int curElements;
    private int capacity;
    private Map<Integer,Node> map;
    private TreeMap<Integer,LinkedHashSet<Node>> cache;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.curElements = 0;
        this.map = new HashMap<>();
        this.cache = new TreeMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        int curCount = map.get(key).count;
        Node curVal = map.get(key);

        cache.get(curCount).remove(curVal); // This statement will remove the object from the last call place in the cache.
        if(cache.get(curCount).size()==0){
            cache.remove(curCount);
        }
        map.get(key).count+=1;
        if(!cache.containsKey(curCount+1)){
            cache.put(curCount+1,new LinkedHashSet<>());
        }
        cache.get(curCount+1).add(curVal);
        return curVal.value;
    }
    
    public void put(int key, int value) {
        LinkedHashSet<Node> tmp = null;
        Iterator<Node> it = null;
        Node node = null;

        if(map.containsKey(key)){
            updateLocInCache(map.get(key));
            map.get(key).value = value;
        }else{
            if(curElements>=capacity){
                tmp = cache.get((int)cache.firstKey());
                it = tmp.iterator();
                node = it.next();
                map.remove(node.key);
                cache.get((int)cache.firstKey()).remove(node);

                if(cache.get(cache.firstKey()).size()==0){
                    cache.remove(cache.firstKey());
                }
            }
            map.put(key,new Node(key,value));
            if(!cache.containsKey(1)){
                cache.put(1,new LinkedHashSet<>());
            }
            cache.get(1).add(map.get(key));
            curElements = curElements < capacity ? curElements+1:curElements;
        }
    }

    public void updateLocInCache(Node node){
        cache.get(node.count).remove(node);
        if(cache.get(node.count).size()==0){
            cache.remove(node.count);
        }
        node.count+=1;
        if(!cache.containsKey(node.count)){
            cache.put(node.count,new LinkedHashSet<>());
        }
        cache.get(node.count).add(node);
    }
    static class Node{
        int key;
        int value;
        int count;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
            this.count = 1;
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */