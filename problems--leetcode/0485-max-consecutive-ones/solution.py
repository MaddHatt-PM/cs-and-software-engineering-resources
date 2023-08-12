class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        res, acc = 0, 0
        for i in range(len(nums)):
            if nums[i] == 1:
                acc += 1
            else:
                res = max(res, acc)
                acc = 0
        return max(res,acc)