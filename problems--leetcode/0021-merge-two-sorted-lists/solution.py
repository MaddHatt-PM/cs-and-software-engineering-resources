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
            tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp

        return prev

    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        res:Optional[ListNode] = None

        while not (list1 is None and list2 is None):
            if list2 is None:
                tmp = list1.next
                list1.next, res = res, list1
                list1 = tmp
                # print('Added list1 where list1 None - {}'.format(res.val))
                continue

            if list1 is None:
                tmp = list2.next
                list2.next, res = res, list2
                list2 = tmp
                # print('Added list2 where list1 None - {}'.format(res.val))
                continue

            if list1.val < list2.val:
                tmp = list1.next
                list1.next, res = res, list1
                list1 = tmp

            else:
                tmp = list2.next
                list2.next, res = res, list2
                list2 = tmp

        return self.reverseList (res)

a2:Optional[ListNode] = ListNode(val=4)
a1:Optional[ListNode] = ListNode(val=2); a1.next = a2
a0:Optional[ListNode] = ListNode(val=1); a0.next = a1
b2:Optional[ListNode] = ListNode(val=4)
b1:Optional[ListNode] = ListNode(val=3); b1.next = b2
b0:Optional[ListNode] = ListNode(val=1); b0.next = b1

print(Solution().mergeTwoLists(a0, b0))