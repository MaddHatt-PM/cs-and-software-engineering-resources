from typing import List, Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

        
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root is None: return []

        levels = []
        queue = [(root, 0)]
        while len(queue) > 0:
            node, lvl = queue.pop()
            
            if lvl < len(levels): levels[lvl].append(node.val)
            else:levels.append([node.val])

            if node.left: queue.insert(0,(node.left, lvl+1))
            if node.right: queue.insert(0,(node.right, lvl+1))

        return levels
