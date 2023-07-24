# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast,slow = head, head
        while fast.next is not None:
            fast = fast.next
            if n != 0:
                n -= 1
            else:
                print(slow.value)
                slow.next
        
        slow = slow.next.next

        return head
        