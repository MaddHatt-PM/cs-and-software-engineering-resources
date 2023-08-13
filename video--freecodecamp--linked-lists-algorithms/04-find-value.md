Given a singly linked list and a value, return whether or not the target value is contained.

Time Complexity: $O(n)$ due to traversal.  
Space Complexity: $O(1)$ for iterative and $O(n)$ for recursive.

```javascript
// Iterative
function contains(head, target) {
    let curr = head;
    while (curr !== null) {
        if (curr.val === target)
            return true;
        curr = curr.next;
    }
    return false;
}
```

```javascript
// Recursive
function contains(head, target) {
    if (head === null) return false;
    if (head.val === target) return true;
    return contains(head.next, target);
}
```