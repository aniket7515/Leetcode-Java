class Solution {
    class Transaction{
        String name;
        int time;
        int amt;
        String location;
        int index;
        Transaction(String name, int time, int amt, String location, int index){
            this.name=name;
            this.time=time;
            this.amt=amt;
            this.location=location;
            this.index=index;
        }
    }
    public List<String> invalidTransactions(String[] transactions) {
        List<String> res= new ArrayList<>();
        List<Transaction> arr= new ArrayList<>();
        HashMap<String,List<Transaction>> map= new HashMap<>();
        int index=0;
        for(String trans:transactions){
            String[] a= trans.split(",");
            Transaction b= new Transaction(a[0],Integer.parseInt(a[1]),Integer.parseInt(a[2]),a[3],index);
            arr.add(b);
            map.putIfAbsent(a[0],new ArrayList<>());
            map.get(a[0]).add(b);
            index++;
        }
        
        for(int i=0;i<arr.size();i++){
            Transaction node= arr.get(i);
            if(node.amt>1000){
                res.add(transactions[i]);
                continue;
                
            }
            boolean flag=false;
            for(Transaction t:map.get(node.name)){
                if(t.index!=i && !node.location.equals(t.location) && Math.abs(node.time-t.time)<=60){
                    flag=true;
                    break;
                }
            }
            if(flag){
                res.add(transactions[i]);
            }
        }
        
        return res;
        
        
    }
}