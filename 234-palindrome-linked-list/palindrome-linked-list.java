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
    public ListNode reverseLL(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode newHead = reverseLL(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next=null;
        return newHead; 
    }
    public boolean isPalindrome(ListNode head) {
        //Step 1: MIDDLE 
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow=slow.next;
        }
        // Step 2: REVERSE
        ListNode newHead = reverseLL(slow.next);
        // Step 3: COMPARE
        ListNode first = head;
        ListNode second = newHead;
        while(second!=null){
            if(second.val!=first.val){
                reverseLL(newHead);
                return false;

            }
            second = second.next;
            first=first.next;
           
        } 
         reverseLL(newHead);
          return true;
    
    }
}