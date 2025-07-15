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
        ListNode temp = head;
        HashMap<ListNode , Integer> map = new HashMap<>();
        while(temp!=null){
            if(!map.containsKey(temp)){
               map.put(temp,map.getOrDefault(temp,0)+1);
               
            }
            else{
                return temp;
            }
            temp=temp.next;

        }

        return null;
    }
}