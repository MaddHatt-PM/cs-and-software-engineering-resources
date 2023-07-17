from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
    
    def __str__(self) -> str:
        if self.next is not None:
            return str(self.val) + str(self.next)
        else:
            return str(self.val)


class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        if not head:
            return []

        slow, fast = head, head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
        
        prev, curr = None, slow.next
        while curr:
            tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp
        slow.next = None

        p0, p1 = head, prev
        while p1:
            tmp = p0.next
            p0.next = p1
            p0 = p1
            p1 = tmp
            



e:Optional[ListNode] = ListNode(val=5); 
d:Optional[ListNode] = ListNode(val=4); d.next = e
c:Optional[ListNode] = ListNode(val=3); c.next = d
b:Optional[ListNode] = ListNode(val=2); b.next = c
a:Optional[ListNode] = ListNode(val=1); a.next = b

Solution().reorderList(a)
print(a)