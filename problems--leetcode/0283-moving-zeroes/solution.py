from typing import List


class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p1 = 0
        for p2 in range(len(nums)):
            if nums[p1] != 0:
                nums[p1], nums[p2] = nums[p2], nums[p1]
                p1 += 1


if __name__ == "__main__":
    nums = [0, 0, 1]
    Solution().moveZeroes(nums)
    print(nums)