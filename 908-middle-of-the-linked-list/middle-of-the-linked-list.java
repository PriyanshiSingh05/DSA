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
    public ListNode middleNode(ListNode head) {
        ListNode slowP = head;
        ListNode fastPtr = head;
        while(fastPtr !=null && fastPtr.next!=null){
            slowP = slowP.next;
            fastPtr = fastPtr.next.next;
        }return slowP;
        
    }
}