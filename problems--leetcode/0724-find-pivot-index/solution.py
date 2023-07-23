from typing import List


class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        rights = sum(nums)

        acc = 0
        for i in range(len(nums)):
            acc += nums[i]
            if acc == rights:
                return i
            rights -= nums[i]

        return -1