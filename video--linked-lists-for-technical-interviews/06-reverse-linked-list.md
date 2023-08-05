Given a singly linked list, reverse it and return the new head.  
To reverse a linked list, it is easier to think of the linked list as a stack that you are popping from to push onto a **second** stack. In this case, that second stack is actually a second linked list. To assist with the transfer, we will need a third temporary variable.

Time Complexity: $O(n)$ due to traversal.  
Space Complexity: $O(1)$ for iterative and $O(n)$ for recursive.

```javascript
// Iterative
function reverse(head) {
    let h1 = head
    let h2 = null

    while (h1 !== null) {
        const tmp = h1;
        h1 = h1.next;
        tmp.next = h2;
        h2 = tmp;
    }

    return h2;
}
```

```javascript
// Recursively
function reverse(head, prev=null) {
    if (head.next === null) return prev;
    const next = head.next;
    head.next = prev;
    return reverse(next, head);
}
```

Note: Javascript supports default parameters