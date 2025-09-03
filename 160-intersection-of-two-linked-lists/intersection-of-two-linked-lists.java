/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

      ListNode t1 = headA;
      ListNode t2 = headB;

      int d = getDifference(headA,headB);

      if(d<0){
        while(d++!=0){
            t2= t2.next;
        }
      }else{
        while(d--!=0){
            t1=t1.next;
        }
      }
        while(t1!=null && t2!=null){
            if(t1==t2) return t1;
            t1 = t1.next;
            t2= t2.next;
        }
        return null;
      
    }

    public static int getDifference(ListNode headA, ListNode headB){
        ListNode t1 = headA;
        ListNode t2 = headB;
        int len1=0, len2=0;
        while(t1!=null){
            len1++;
            t1= t1.next;
            
        }
        while(t2!=null){
            len2++;
            t2= t2.next;
        }
        
        return len1-len2;
    }
}