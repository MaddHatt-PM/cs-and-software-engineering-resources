# Max Root to Leaf Path Sum
Given a binary tree, what is the maximum sum of a path from the root node to a child node.
Note: The function should return a numeral value and **not** an array of nodes for the path.

As we are accumulating values, it is a little difficult to associate the binary decision making process into a linear data structure that an iterative function may use.
Similar to a minValue and maxValue problem, we will want our base case's, a null node, to not contribute to our final answer. As we are finding the maximum value, we can use `negative infinity` as all greater than operations will have the other value be used.

```python
# Python solution - Recursive DFS
def maxPathSum(head):
    if head is None: return float('-inf')
    if head.left is None and head.right is None: return head.value
    return head.value + max(maxPathSum(head.left), maxPathSum(head.right))
```

```javascript
// Javascript solution - Recursive DFS
const maxPathSum = (head) => {
    if (head === null) return -Infinity;
    if (head.left === null && head.right === null) return head.val;
    return head.val + Math.max(maxPathSum(head.left), maxPathSum(head.right));
}
```