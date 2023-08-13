# Tree Min Value
Given a binary tree, what is the minimum value in a tree?
Note that this binary tree is **not** a MinHeap.

Recall that most tree algorithms will rely on a depth first or a breadth first traversal.
Similar to our `tree sum` solution, we can use DFS recursion approach.
If we want to generate a unique solution for an empty-tree case, we can use a helper function that processes that case and then starts the recursive process.

```python
# Python - Recursive
def treeMin(head):
    if head is None: return float("inf")
    return min(head.val, treeMin(head.left), treeMin(head.right))
```

Note: The practice examples from the videos specify a non-empty tree so that edge case will not be covered.

```javascript
// Javascript solution - Iterative DFS
const treeMin = (head) => {
    const stack = [head];
    let min = Infinity;

    while (stack.length > 0) {
        const curr = stack.pop();
        if (curr.value < min) min = curr.value;

        if (curr.right !== null) stack.push(curr.right);
        if (curr.left !== null) stack.push(curr.left);
    }

    return min;
}
```

```javascript
// Javascript solution - Iterative BFS
const treeMin = (head) => {
    const queue = [head];
    let min = Infinity;

    while (queue.length > 0) {
        const curr = queue.shift();
        if (curr.val < min) min = curr.value;

        if (curr.right !== null) queue.push(curr.right);
        if (curr.left !== null) queue.push(curr.left);
    }

    return min;
}
```

Note: For JavaScript, there is no built in queue structure that is optimal. When `Array.prototype.shift()` is called, it is a $O(n)$ operation. This is because the JavaScript runtime will need to shift every value by one. Thus this solution is more of an $O(n^2)$ time complexity;

```javascript
// Javascript solution - Recursive DFS
const treeMin = (head) => {
    if (head === null) return Infinity;
    return Math.min(head.val, treeMin(head.left), treeMin(head.right));
}
```

-----

Consider a treeMax function, how would that be implemented in JavaScript?
```javascript
const treeMax = (head) => {
    if (head === null) return -Infinity;
    return Math.max(head.val, treeMax(head.left), treeMax(head.right));
}
```