from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        size = len(nums)

        # Evaluate left
        lefts = [1] * size
        for i in range(1, size):
            lefts[i] = nums[i-1] * lefts[i-1]

        # Evaluate right
        acc = 1
        for i in range(size-2, -1, -1):
            acc = nums[i+1] * acc
            lefts[i] *= acc

        return lefts