from typing import List
from collections import defaultdict

class Solution:
    def findSmallestSetOfVertices(self, n: int, edges: List[List[int]]) -> List[int]:
      '''
      Note that this graph is a acyclic directed graph. With this info, we can reinterpret
      this graph as a tree with multiple roots and some shared leaf nodes.
      Recall that all leaf nodes are connected to each other through at least one node,
      the root node.
      Therefore, the shortest set of vertices will consist of all the root nodes.

      To solve this, we can construct a dictionary that links every destination node
      with its source node. If a node does not have a source node, then it must be a root.
      '''
      
      '''
      Initial solution. Felt like I could get away without using a defaultdict
      '''
      # incoming = defaultdict(list)
      # for src, dst in edges:
      #   incoming[dst].append(src)
      
      # results = []
      # for i in range(n):
      #   if incoming[i] == []:
      #     results.append(i)

      # return results

      incoming = [0 for i in range(n)]
      for _, dst in edges:
        incoming[dst] += 1
      
      return [i for i in range(n) if incoming[i] == 0]

print(Solution().findSmallestSetOfVertices(6, [[0,1],[0,2],[2,5],[3,4],[4,2]]))