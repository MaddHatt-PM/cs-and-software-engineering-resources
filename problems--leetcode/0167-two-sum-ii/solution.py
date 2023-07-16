from typing import List


class Solution:
    # def binarySearch(self, arr, low, high, x):
    #     # low = 0
    #     mid = 0
    #     # high = len(arr) - 1

    #     while low <= high:
    #         mid = (high + low) // 2

    #         # X is greater, so ignore left half
    #         if arr[mid] < x: low = mid + 1

    #         # X is lower, so ignore right half
    #         elif arr[mid] > x: high = mid - 1
            
    #         else: return mid
        
    #     return -1

    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        p0 = 0
        p1 = len(numbers) - 1

        while p0 <= p1:
            if numbers[p0] + numbers[p1] == target:
                return [p0+1, p1+1]
            elif numbers[p0] + numbers[p1] < target:
                p0 += 1
            else:
                p1 -= 1



numbers = [-3,3,4,90]
target = 0
print(Solution().twoSum(numbers, target))