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
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        prev = None

        while curr is not None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev


a:Optional[ListNode] = ListNode(val=1)
b:Optional[ListNode] = ListNode(val=2); a.next = b
c:Optional[ListNode] = ListNode(val=3); b.next = c
d:Optional[ListNode] = ListNode(val=4); c.next = d
e:Optional[ListNode] = ListNode(val=5); d.next = e

if __name__ == '__main__':
    print(a)
    print(Solution().reverseList(head=a))
