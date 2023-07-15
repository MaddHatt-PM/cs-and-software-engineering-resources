class Solution:
    def validPalindrome(self, s: str) -> bool:
        p0, p1 = 0, len(s)-1

        while p0 <= p1:
            if (s[p0] != s[p1]):
                sub0, sub1 = s[p0:p1], s[p0+1: p1+1]
                return sub0 == sub0[::-1] or sub1 == sub1[::-1]

            p0 += 1
            p1 -= 1

        return True


# s = "abbc"
s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"
print(Solution().validPalindrome(s))