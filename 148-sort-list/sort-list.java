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
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2= list2.next;

            }
            temp = temp.next;
        }
        //any remaining
        if(list1!=null){
            temp.next = list1;
           
        }else{
            temp.next = list2;
           
        }
        return dummyNode.next;
        
    }//mid calculate tortoise hare 
     public ListNode mid (ListNode head)
     {   if(head== null) return null;               
         ListNode slow = head;
         ListNode fast = head.next;
         while(fast != null && fast.next != null)
         {
            slow= slow.next;
            fast= fast.next.next;

         }
         return slow;
         
     }
     //mergesort
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
         ListNode middle = mid(head);
         ListNode leftN = head;
         ListNode rightN = middle.next;
         middle.next = null;
         leftN =sortList(head);
         rightN =sortList(rightN);
         return  mergeTwoLists(leftN , rightN);


        
        
    }
}