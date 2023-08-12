class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        def findBounds(sp):
            l, r = 0, len(potions)
            while l < r:
                m = l + (r - l) // 2
                if sp * potions[m] >= success: r = m
                else: l = m + 1
            return len(potions) - l

        potions.sort()
        return [findBounds(sp) for sp in spells]
        

