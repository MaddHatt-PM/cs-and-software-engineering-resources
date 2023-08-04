# Key Terms:
__Node__:
  A container of data.  
__Linked-List__:
  A collection of nodes such that there are links from one node to another where each node points to at most one other node. The last node must link to null. As such, this data structure is referred to as an `ordered data structure`.  
__Head__:
  The node at the very start of a linked list.  
__Tail__:
  The node at the very end of a linked list.  

# Arrays vs Linked Lists
Note: An array is also an ordered data structure.  
In comparison, the indices of an array corresponds to the position of a linked list. Further, the elements of an array correspond to the nodes of a linked list.
In contrast, arrays are contiguous in memory while linked lists can have their nodes in different locations in memory. Further, arrays have a memory limit due to its contiguous nature while linked lists do not.

| Operations | Array | Linked List |
| - | - | - |
| Insertion with known position | $O(n)$ | $O(1)$ |
| Removal with known position | $O(n)$ | $O(1)$ |
| Access with known position $p$ | $O(1)$ | $O(p)$  |



# Linked List Traversal
## Common variable names
`node.next` where next is the optional reference to the next node.  
`curr`: the current node being referenced. Note: If the head's reference is lost, there is no way of getting back the original data.  

Notice: For a recursive approach, we can use the logic of `curr == null` as our base case.

## Implementation
Note: Linked List are an object oriented data structure
```javascript
// Constructing a linked list
class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
    }
}

const a = new Node('A');
const b = new Node('B');
const c = new Node('C');
const d = new Node('D');

a.next = b;
b.next = c;
c.next = d;
/// a -> b -> c -> d
```

```javascript
// Traversal - Iterative
const printLinkedList = (head) => {
    let curr = head;
    let output = ''
    while (curr !== null) {
        output += `${curr.val}`
        curr = curr.next;
    }
    
    console.log(output);
}
```

```javascript
// Traversal - Recursive
const printLinkedList = (head) => {
    if (head === null) return;
    console.log(head.val);
    printLinkedList(head.next);
} 
```

Recall the recursion template:
- What are my base cases? How does my function handle those base cases?
- If the base case is not encountered, the function should call itself