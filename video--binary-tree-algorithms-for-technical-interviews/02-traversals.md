# Depth First Traversal
Assume an implementation of a binary tree node, where a child node with no reference points to null.
For a Depth First Traversal, we will go as deep as possible with a leftward preference. When a null reference is reached, we move laterally by trying to go back upwards from where we encountered the null reference.
```
       a
      / \
     b   c
    / \   \
   d   e   f

values = [a,b,d,e,c,f]
```

To program this type of traversal, we can utilize a stack where we push each traversed node onto the `stack`. Additionally, we will use an array, `results`, to hold all of our traversed values.

Our exit condition for the traversal is to check if the `stack` is empty.
To start the traversal, we will push the root node onto the `stack`.
For each iteration, we will pop the top of the `stack`. The popped node's value will be pushed onto the `results` array. Then we push the `right` **then** `left` children of the popped node if they are not null. Note: A `stack` operates on a first-in first-out basis, so the order of `right` **then** `then` is crucial. Finally, we check if the `stack` is empty to exit the traversal.

The time complexity of the traversal will be $O(n)$ as we will need to iterate through the entire structure.
The space complexity of the traversal will be $O(n)$ as we need to store the `results` array. If we disregard that variable, the space complexity of `stack` is $O(h)$ where $h$ is the maximum height of the binary tree.

## Example Problem
Write a function, depthFirstValues, that takes in the root of a binary tree. The function should return an array containing all values of the tree in depth-first order.

```javascript
class Node(val) {
    this.val = val;
    this.left = null;
    this.right = null;
}

// Iteratively
function depthFirstValues(head) {
    const stack = [];
    const results = [];
    if (head) {
        stack.push(head);
    }

    while (stack.length > 0) {
        const current = stack.pop();
        results.push(current.val);
        
        if (current.right)
            stack.push(current.right);
        if (current.left)
            stack.push(current.left);
    }

    return results;
}

/*
 * Recursively
 * Recall that the iterative solution used a stack to keep track
 * of the traversed values. In this case, we are using the
 * memory call stack as our data structure.
 */
function depthFirstValues(head) {
    if (node === null) return [];
    const lefts = depthFirstValues(head.left);
    const right = depthFirstValues(head.right);
    return results [root.val, ...lefts, ...rights];
}
```


# Breadth First Values
Def: `Breadth`: The distance across or side-to-side from something.  
With a depth first approach, we search as far deep to the left as possible.
With a breadth first approach, we search the entirety of each level from left to right before going down to the next level.

```
       a
      / \
     b   c
    / \   \
   d   e   f

values = [a,b,c,d,e,f]
```

Recall that the depth first approach used a stack to orchestrate the traversal.
For a breadth first approach, we will use a queue, a data structure with a first-in-last-out pattern.
For each node we visit, we add its `left` and `right` references to the end of the queue if they are not null. To obtain our values, we will store them into a results stacks.
Iterations:
| queue     | current | results            |
| --------- | ------- | ------------------ |
| [a]       | null    | []                 |
| [c, b]    | a       | [a]                |
| [e, d, c] | b       | [a, b]             |
| [f, e, d] | c       | [a, b, c]          |
| [f, e]    | d       | [a, b, c, d]       |
| [f]       | e       | [a, b, c, d, e]    |
| []        | f       | [a, b, c, d, e, f] |

Time Complexity is $O(n)$ as we will need to traverse through the entire tree with an optimal queue.  
Space Complexity is worst case $O(H)$ where H is the height of the tree.

## Example Problem
Write a function, breadthFirstValues, that takes in the root of a binary tree. The function should return an array containing all values of the tree in breadth-first order.

```javascript
/*
 * Iteratively
 */
const breadthFirstValues(root) {
    if (root === null) return [];

    const queue = [ root ];
    const results = [];
    
    let curr;
    while (queue.length > 0) {
        curr = queue.shift()
        results.append(curr.val);

        if (curr.left) queue.push(curr.left);
        if (curr.right) queue.push(curr.right);
    }
    return results;
}

/*
 * Notice that if we push left then right, then the order goes left to right.
 * If we went right to left, we would have a breadth first traversal going right to left.
 */
```

Recall that the `depth-first traversal` uses a stack in the iterative version and the call stack as the recursive version. With a `breadth-first traversal`, there is no queue equivalent data structure in memory so that it is significantly more difficult to implement. In order to do, we will need to pass an our queue array to each called function to be used. Due to the complexity, it will be skipped for these notes.