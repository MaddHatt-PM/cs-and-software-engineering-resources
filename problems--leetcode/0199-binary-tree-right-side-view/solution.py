# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        if root is None: return []

        queue, res = [(root, 0)], dict()
        while queue:
            node, layer = queue.pop()
            if layer not in res: res[layer] = node.val
            if node.right: queue.insert(0,(node.right, layer + 1))
            if node.left: queue.insert(0,(node.left, layer + 1))

        keys = sorted(list(res.keys()))
        return [res[k] for k in keys]