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
        //brute force
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;

            if(head.next==null){
            ListNode newhead=head.next;
            return newhead;
        }
        }
        temp = head;

        int res = count/2;
        while(temp!=null){
            res--;
            if(res==0){
                ListNode Middle = temp.next;
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }return head;
        
    }
}