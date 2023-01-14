/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> map= new HashMap<>();
        for(Employee i:employees){
            map.put(i.id,i);
        }
        Queue<Employee> q= new LinkedList<>();
        q.add(map.get(id));
        int sum=0;
        
        while(!q.isEmpty()){
            Employee emp=q.poll();
            sum+=emp.importance;
            for(int i:emp.subordinates){
                q.add(map.get(i));
            }
        }
        
        return sum;
    }
}