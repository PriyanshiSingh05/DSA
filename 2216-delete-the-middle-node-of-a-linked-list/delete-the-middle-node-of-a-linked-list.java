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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null){
            return null;
        }

        ListNode slowP = head;
        ListNode fastP = head;
        fastP = fastP.next.next;

        while(fastP!=null && fastP.next!=null){
            slowP = slowP.next;
            fastP= fastP.next.next;
        }
        //delete node
        if(slowP.next!=null){
            ListNode del = slowP.next;
            slowP.next=slowP.next.next;
        }return head;


        
        
    }
}