# Minimum Number of Vertices to Reach all Nodes - Leetcode 1557 - Python
## Reading the Problem
Recall a directed graph is a collection of nodes that `direct` or point to other nodes.
Recall an acyclic graph is a graph that does not have a subset of nodes that can infinitely direct to other nodes in that subset.

Clarification: The output will need to be a path from beginning to end whose collection of nodes can connect to all other nodes.

---

## Drawing Explanation
With graph problems its good to think in terms of DFS/BFS solutions.
Def: Depth-First Search (DFS) - Algorithm for traversing/searching of tree/graph data structures.
  The algorithm starts at a root node and involves exploring as far as possible along each branch (wikipeda).
Def: Breadth-First Search (BFS) - Algorithm for traversing/searching of tree/graph data structures.
  The algorithm starts a root node and explores all nodes on the next lower level. A good data structure to help with this process would be a queue that considers depth in its priority.

A more advanced algorithm may be Dijkstra's algorithm (topic to look into for later).

An directed acyclical graph tells us that we can reorganize this graph as a tree structure where are nodes with no incoming edges are actually roots.
Note: This tree structure will have some nodes that are shared.

### Complexities
Time and Space: O(E+V) where E is the number of edges and V is the number of vertices

---

## Coding Explanation
```python
class Solution:
    def findSmallestSetOfVertices(self, n: int, edges:List[List[int]]) -> List[int]:
        '''
        n is the number of nodes in the 
        edges are an ordered pair for [src,dst] where src and dst are nodes
        '''
        incoming = collections.defaultdict(list)
        for src, dst in edges:
            incoming[dst].append(src)

        result = []
        for i in range(n):
            if not incoming[i]:
                res.append(i)
        return result
```

Note: A defaultdict takes a data structure as an parameter and then can be used as a dictionary.
    Fundamentally, this will behave like a classic python dictionary but a KeyError will not be raised when an absent value to a key is used. When this occurs an empty list will be returned. A function can be also be passed to handle the default value.