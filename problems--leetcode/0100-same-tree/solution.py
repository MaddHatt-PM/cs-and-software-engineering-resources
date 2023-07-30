from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        def recurse(p0:  Optional[TreeNode], q0:  Optional[TreeNode]) -> bool:
            if (not p0 and q0) or (p0 and not q0):
                return False
            if not p0 and not q0:
                return True
            if p0.val != q0.val:
                return False
            return recurse(p0.left, q0.left) and recurse(p0.right, q0.right)

        return recurse(p,q)