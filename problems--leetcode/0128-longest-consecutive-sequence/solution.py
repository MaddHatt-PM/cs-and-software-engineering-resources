from typing import List

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        longest = 0
        nums = set(nums)

        for x in nums:
            if x-1 not in nums:
                dist = 1
                while (x + dist) in nums:
                    dist += 1
                longest = max (longest, dist)
        
        return longest


