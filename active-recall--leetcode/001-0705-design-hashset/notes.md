# Design HashSet - Leetcode 705 - Python
## Reading the Problem
Design a hashset without using any built-in hashtable libraries.
Required functionality:
- void add(key)
- boolean contains(key)
- void remove(key)
- Rehashing on duplicates with a slightly different array
To organize the hashes, we will use a linkedlist on event of duplicates.

---

## Drawing Explanation 
NeetCode goes through a whiteboarding section in the video rather than going straight towards psuedocode or code.
Recall that we can use an array as our underlying data structure and use the hash value (int) modulus array length.
```python
index = hash(item) % len(data_array)
data_array[index] = item
```
Since constraints are safe at a max insertion count of 10,000, we can initialize our array at 10,000.
During interviews, a dynamic hashset might be too complicated due to time constraints.

Collisions will need to be accounted for.
To accommodate for these, we can make our underlying array be an array of linkedlist.
Each node will be of class:
```python
class Node():
  def __init__(key:int):
    self.key = key
    self.next = None
```
When an `hashset.contains()` is called, it will need to traverse the linkedlist to look for its key.
Note that `key` and the `key`'s index are different values.
Remember that `hashset.add()` will need to call `hashset.contains()` before actually adding a key.
Sets cannot contain duplicates.

As far as complexities go, we will need to ensure our hashset is balanced where any linkedlist is not too long.
LinkedList traversals will only add to complexities.

### Complexities
- Time Complexities:
  - Best: O(1)
  - Average: O(1)
  - Worst: O(1)
- Space Complexities
  - O(n) where `n` is the size of the `data_array`

---

## Coding explanation
```python
class ListNode: 
  def __init__(self, key):
    self.key = key
    self.next = None

class MyHashSet:
    def __init__(self):
        '''
        With our linked list, we will be using a dummy node.
        Using a dummy node will ensure that we do not need to account for edge cases. 
        We can initialize our array by using a list comprehension.
        '''
        self.set = [ListNode(0) for i in range(10**4)]

    def add(self, key) -> None:
        index = key % len(self.set)
        cur = self.set[index]

        while cur.next is not None:
            if cur.next.key == key:
                return
            cur = cur.next
        cur.next = ListNode(key)

    def remove(self, key) -> None:
        '''
        Note that with our dummy node, when we call cur.next = cur.next.next,
        there is no way for an error can be raised.
        '''
        index = key % len(self.set)
        cur = self.set[index]

        while cur.next is not None:
            if cur.next.key == key:
                cur.next = cur.next.next
                return
            cur = cur.next
        cur.next = ListNode(key)

    def contains(self, key) -> bool:
        index = key % len(self.set)
        cur = self.set[index]

        while cur.next is not None:
            if cur.next.key == key:
                return True
            cur = cur.next
        return False
```