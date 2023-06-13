/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> arr= new ArrayList<>();
        ListNode curr=list1;
        while(curr!=null) {
            arr.add(curr.val);
            curr=curr.next;
        }
        curr=list2;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(arr);
        ListNode temp=new ListNode(-1);
        curr=temp;
        for(int i=0;i<arr.size();i++){
            curr.next= new ListNode(arr.get(i));
            curr=curr.next;
        }
        return temp.next;
    }
}