from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __str__(self):
        if self.next:
            return str(self.val) + '>' + str(self.next)
        else:
            return str(self.val)

    def __repr__(self):
        return str(self)


class Solution:
    def reverseLinked(self, head: Optional[ListNode]) -> Optional[ListNode]:
        res: Optional[ListNode] = None
        while head:
            p1, head = head, head.next
            p1.next = res
            res = p1
        return res

    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow, fast = head, head
        while fast.next and fast.next.next:
            fast = fast.next.next
            slow = slow.next

        pivot = self.reverseLinked(slow.next)
        while pivot:
            if head.val != pivot.val:
                return False
            head = head.next
            pivot = pivot.next
        return True