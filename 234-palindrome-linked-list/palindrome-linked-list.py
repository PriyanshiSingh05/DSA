# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        arr = []
        
        temp = head
        
        # Traverse linked list and store values
        while temp:
            arr.append(temp.val)
            temp = temp.next
        
        # Check palindrome
        return arr == arr[::-1]