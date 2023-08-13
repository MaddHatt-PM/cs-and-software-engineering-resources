# Tree Sum
Given a binary tree with an additional attribute `val` which is some integer value.
```
    3
   / \
  11  4
 /  \  \
4    2  1
```

A straightforward solution would be to use a depth-first or breadth-first traversal and compute values along the way.
However, we can solve this problem recursively.
Recall that for recursion and induction, we will need a `base case`. In this scenario, recall a node can have two child nodes that can be null. For each null node, we can substitute in a zero. For a simple scenario, we need to return the sum of the selected node, the left child, and the right child.

```python
# Python solution
def treeSum(node):
    if node is None: return 0
    return node.val + treeSum(node.left) + treeSum(node.right)
```

For time complexity, all nodes will be visited so the time and space complexity is $O(n)$.

```javascript
// JavaScript solution - Recursive (DFS)
const treeSum(head) {
    if (head === null) return 0;
    return head.val + treeSum(head.left) + treeSum(head.right);
}
```

```javascript
// JavaScript solution - Iterative (BFS)
const treeSum = (head) => {
    if (root === null) return 0;

    const queue = [ head ]
    let total = 0;
    while(queue.length > 0) {
        const curr = queue.shift();
        total += curr;
        if (curr.left !== null) queue.push(curr.left); 
        if (curr.right !== null) queue.push(curr.right); 
    }

    return total;
}
```

Specifically when writing recursive code, try to keep your code as clean and simplistic as possible.