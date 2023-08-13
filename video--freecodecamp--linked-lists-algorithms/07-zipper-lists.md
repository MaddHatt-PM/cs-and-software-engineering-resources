Given two nonempty linked lists, *zipper* the two linked lists such that the first input's head is first and then every other node is from opposite arrays. If one linked list is longer than another, then the remaining linked list is fully appended on.

As we have two linked lists, `listA` and `listB`, we should have four pointers, `currA`, `currB`, `head` and `tail`.  
For an iterative approach, we can use a boolean flag to indicate which list we are pulling from.  
For each iteration, we swap our boolean and append the `curr_` node to tail.  
When we exhaust an list, we can break out early to append the rest of the longer `list_`.  
Finally, we return `head`.

Time Complexity: $O(min(m, n))$ where $m$ is `listA` and $n$ is `listB`.  
Space Complexity: $O(1)$ for iterative and $O(n)$ for recursive.

```javascript
// Iterative
function zipperLists(listA, listB) {
    const head = listA;
    let tail = head;
    let currA = listA.next;
    let currB = listB;
    let getFromA = false;

    while (currA !== null && currB !== null) {
        tmp = getFromA ? currA : currB;
        tail.next = tmp;
        tail = tail.next;

        if (getFromA) currA = currA.next;
        else currB = currB.next;
        
        getFromA = !getFromA;
    }

    tail.next = currA !== null ? currA : currB;

    return head;
}
```

```javascript
// Recursive
function zipperLists(listA, listB) {
    if (listA === null && listB === null) return null;
    if (listA === null) return listB;
    if (listB === null) return listA
    
    const nextA = listA.next;
    const nextB = listB.next;
    listA.next = listB;
    listB.next = zipperLists(nextA, nextB);
    return listA;
}
```