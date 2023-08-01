class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        counts = Counter(nums)
        res = 0
        for a in counts.keys():
            b = k - a
            if b in counts.keys() and counts[a] > 0 and counts[b] > 0:
                if a == b:
                    occ = counts[a] // 2
                    counts[a] -= occ
                    res += occ
                else:
                    occ = min(counts[a], counts[b])
                    counts[a] -= occ
                    counts[b] -= occ
                    res += occ
        return res