Given a singly linked list, return the sum of the linked list.
Recall: Traverse in-order and accumulate the sum

When thinking of recursive data structures, it is helpful to consider the most basic state: the empty state and then to build up from that state. Think **inductively**.

Time Complexity: $O(n)$ for traversal  
Space Complexity: $O(1)$ for iterative and $O(n)$ for space 

```javascript
// Iterative
function sumLinkedList(head) {
    let sum = 0
    let curr = head;
    while (curr !== null) {
        sum += curr.val;
        curr = curr.next;
    }
    return sum;
}
```

```javascript
// Recursive
function sumLinkedList(head) {
    if (head === null) return head.val;
    return head.val + sumLinkedList(head.next);
}
```