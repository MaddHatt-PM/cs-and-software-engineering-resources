Given a Singly linked list, return all values as an array.
Note: Our function will only need a parameter for the head node.
We will need to iterate through the linked list with a variable to accumulate the values into an array.

Time Complexity: $O(n)$ due to traversal  
Space Complexity: $O(n)$ due to output array

```javascript
// Linked List definition
class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
    }
}
```

```javascript
// Iterative
function toValuesArray(head) {
    let res = []
    let curr = head;
    while (curr !== null) {
        res.append(curr.val);
        curr = curr.next;
    }
    return res;
}
```

```javascript
// Recursive
function toValuesArray(head) {
    if (head === null) return [];
    return [head.val, ...toValuesArray(head.next)]
}

// Recursive - Extra parameter
function toValuesArray(head, values) {
    if (head === null) return;
    values.push(head.val);
    toValuesArray(head.next, values);
}
```
