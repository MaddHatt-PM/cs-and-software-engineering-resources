from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res, lowest = 0, prices[0]

        for i in range(len(prices)):
            lowest = lowest if lowest < prices[i] else prices[i]
            res = res if prices[i] - lowest < res else prices[i] - lowest

        return res