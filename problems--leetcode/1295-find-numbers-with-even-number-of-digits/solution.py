class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        res = 0
        for n in nums:
            res += 1 if len(str(n)) % 2 == 0 else 0
        return res