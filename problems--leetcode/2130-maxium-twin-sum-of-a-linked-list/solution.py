# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __str__(self) -> str:
        if self.next is not None:
            return str(self.val) + '|' +  str(self.next)
        else:
            return str(self.val)


class Solution:
    def getPivot(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head, head

        while fast is not None and fast.next is not None:
            fast = fast.next.next
            slow = slow.next
        
        return slow

    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        prev = None

        while curr is not None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev

    def pairSum(self, head: Optional[ListNode]) -> int:
        pivot = self.reverseList(self.getPivot(head))

        result = 0
        selA = head
        selB = pivot
        while selB is not None:
            result = max(result, selA.val + selB.val)
            selA, selB = selA.next, selB.next

        return result

a:Optional[ListNode] = ListNode(val=4)
b:Optional[ListNode] = ListNode(val=2); a.next = b
c:Optional[ListNode] = ListNode(val=2); b.next = c
d:Optional[ListNode] = ListNode(val=3); c.next = d

if __name__ == '__main__':
    print(a)
    print(Solution().pairSum(head=a))