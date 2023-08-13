from typing import List


class Solution:
    def maxSum(self, nums: List[int]) -> int:
        max_sum = -1
        
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                a = str(nums[i])
                b = str(nums[j])
                if max(a) == max(b):
                    res = nums[1] + nums[j]
                    max_sum = max(max_sum, nums[i] + nums[j])
            
        return max_sum