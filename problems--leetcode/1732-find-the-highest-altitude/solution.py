from typing import List


class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        highest, curr = 0, 0
        for dst in gain:
            curr += dst
            highest = max(highest, curr)
        return highest
