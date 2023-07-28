# Approach
Notice that the requirement is to return only *True* or *False*, so we can modify the linked list input as needed. With a $$O(1)$$ space constraint, the simplest approach is to find the middle node with a `slow`/`fast` pointer approach. With the pivot, we reverse the linked list from that point. From the reversed second half, we can step through the original head and the reversed half to compare each node's `val`.


# Complexity
- Time complexity: $$O(n)$$
- Space complexity: $$O(1)$$


# Code
```
# Definition for singly-linked list.
# class ListNode:
#   def __init__(self, val=0, next=None):
#       self.val = val
#       self.next = next


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

        slow = self.reverseLinked(slow.next)
        while slow:
            if head.val != slow.val:
                return False
            head = head.next
            slow = slow.next
        return True
```