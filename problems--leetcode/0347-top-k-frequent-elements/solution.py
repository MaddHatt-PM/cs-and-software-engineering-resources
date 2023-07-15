# from collections import Counter
import heapq
from collections import Counter
from typing import List

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counts = Counter(nums)

        heap = []
        for key in counts.keys():
            heapq.heappush(heap, (counts[key], key))
            if len(heap) > k:
                heapq.heappop(heap)

        output = []
        for _ in range(len(heap)):
            output.append(heapq.heappop(heap)[1])

        return output[len(output) - k:]

nums = [4,1,-1,2,-1,2,3]
k = 2
output = Solution().topKFrequent(nums, k)
print(output)