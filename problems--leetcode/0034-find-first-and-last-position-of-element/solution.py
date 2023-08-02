class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l, r = 0, len(nums)
        while l < r:
            m = l + (r - l) // 2
            
            if nums[m] == target:
                p0 = m
                while p0-1 >= 0 and nums[p0-1] == nums[m]:
                    p0 -= 1
                p1 = m
                while p1+1 < len(nums)  and nums[p1+1] == nums[m]:
                    p1 += 1
                return [p0, p1]

            elif nums[m] < target:
                l = m + 1

            else:
                r = m

        return [-1, -1]