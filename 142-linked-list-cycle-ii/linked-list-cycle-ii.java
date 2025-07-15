/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
       
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;

            //detect a cycle that is they collide for first time
            if(slow == fast){
                //it means they collided now 
                slow = head;
                while(slow !=fast){
                    fast = fast.next;
                    slow= slow.next;
                }return fast; //can return slow as well   
            }

        }

        return null ;
    }
}