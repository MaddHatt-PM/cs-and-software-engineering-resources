# Key Terms:
__Parent-Child Relationships__:
  Description of how nodes are connected to each other.
  The node that contains the reference to another node is called the __parent__ while the referenced node is the __child__.
__Root__:
  A node that has no parent. This node is commonly used to pass the entire data structure to different functions.
__Leaf__:
  A child node that has no children or does not reference any other nodes. Leaf nodes can be on different levels.
__Edge Count__:
  The amount of connections to another node.
__Binary Tree__:
  A tree that satisfies the following conditions:
  - All nodes reference at most 2 other nodes.
  - There is at least a single root node.
  - There is exactly one path from the root node to any node. No cycles. Excluding singleton and empty tree.
__Singleton Tree__:
  A special binary tree where the only node is a single node without any children. 
__Empty Tree__:
  A special binary tree where there are no nodes in the data structure.
__Cycle__:
  A circular sequence of nodes where there are an infinite number sequences from one node to another. 

# Representations as code
To create a binary tree, we will need Object-Oriented Programming to create a node class.
This binary tree node class will, at minimum, need a `left` and `right` reference to another binary tree node.
These reference variable will need to be an optional (None, null, etc) reference.
Note: We can add more variables to the node class as needed. The following example will add a `val` variable for further functionality.

```javascript
class Node {
    constructor(val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
```
Example Application:
```javascript
const a = new Node(a);
const b = new Node(b);
const c = new Node(c);
const d = new Node(d);
const e = new Node(e);
const f = new Node(f);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;

/*
* Visualization
*       a
*      / \
*     b   c
*    / \   \
*   d   e   f
*/
```