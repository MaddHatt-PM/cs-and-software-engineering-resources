# Tree Includes
Given a target value and the head of the following tree structure, determine if the target value appears in the tree. Note that this is a generic binary tree and not a binary search tree.
```
    a
   / \
  b   c
 / \   \
d   e   f
```


## Breadth-First Search - Iteratively
```javascript
/*
 * Time Complexity: O(n) 
 * Space Complexity: O(n)
 */ 
const isContained(head, target) {
    if (head === null)
        return false;

    const curr;
    const queue = [ head ];
    while (queue.length > 0) {
        curr = stack.pop();
        if (curr.val === target) return true;
        
        if (curr.left) queue.shift(curr.left);
        if (curr.right) queue.shift(curr.right);
    }

    return false;
}
```

## Depth-First Search - Recursively
```javascript
/*
 * Time Complexity: O(n) 
 * Space Complexity: O(n)
 */ 
const isContained(head, target) {
    if (head === null) return false;
    if (head.val === target) return true;
    return isContained(head.left, target) || isContained(head.right, target);
}
```