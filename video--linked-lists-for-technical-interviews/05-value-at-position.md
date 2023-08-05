Given a singly linked list, find the value of a node at position $n$.
If the index is out of bounds, return $-1$.

Time Complexity: $O(n)$ due to traversal.  
Space Complexity: $O(1)$ for iterative and $O(n)$ for recursive.

```javascript
// Iterative
function valueAtIndex(head, index) {
    let curr = head;
    while(curr !== null) {
        if (index-- === 0) return curr.val;
        curr = curr.next;
    }

    return -1;
}
```

```javascript
// Recursive
function valueAtIndex(head, index) {
    if(head === null) return -1;
    if(index === 0) return head.val;
    return valueAtIndex(head.next, index - 1);
}
```