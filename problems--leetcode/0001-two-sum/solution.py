from typing import List

class Solution:
  def twoSum(self, nums: List[int], target: int) -> List[int]:
    # hashset = {}
    # for i in range(len(nums)):
    #   if nums[i] in hashset.keys() and nums[i] * 2 == target:
    #     return [hashset[nums[i]], i]
    #   else:
    #     hashset[nums[i]] = i

    # for key in hashset.keys():
    #   if target - key in hashset.keys() and key != target / 2:
    #     return [hashset.get(key), hashset.get(target - key)]

    lookup = {}
    for i, num in enumerate(nums):
        diff = target - num
        if diff in lookup:
            return [i, lookup[diff]]
        lookup[num] = i