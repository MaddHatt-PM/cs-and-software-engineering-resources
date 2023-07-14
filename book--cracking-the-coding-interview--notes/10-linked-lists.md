# Chapter 2 - Linked Lists
A linked list is a data structure comprised on nodes that reference other nodes.
Common Configurations:
- Singly Linked Lists: Each node only references the next node in the chain.
- Doubly Linked List: Each node references the previous and next node in the chain.

To abstract away the underlying node structure, we can create a LinkedList object.
Some implementations may use a dummy node as the head to avoid some edge cases.

## Deleting a Node from a Singly Linked List
When deleting a node, we will need to re-reference the previous node's next to the target's next node.
This will require for us to be on the previous node to the target to perform the changes.
```python
# Example
if node.next.value == target:
  node.next = node.next.next
  return
```

For memory managed languages, dereferencing the node is all thats needed.
For other languages, you will need to clear its memory manually.