class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxCount = max(candies)
        return [candy + extraCandies >= maxCount for candy in candies ]