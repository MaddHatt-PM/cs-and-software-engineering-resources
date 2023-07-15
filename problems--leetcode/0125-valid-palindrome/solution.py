class Solution:
    def isPalindrome1(self, s: str) -> bool:
        letters = set('abcdefghijklmnopqrstuvwxyz1234567890')
        s = [c for c in s.lower() if c in letters]
        
        p1, p2 = 0, len(s)-1
        while p1 < p2:
            if s[p1] != s[p2]:
                return False
            p1 += 1
            p2 -= 1

        return True

    def isPalindrome2(self, s: str) -> bool:
        s = "".join([c for c in s if str.isalnum(c)]).lower()
        
        p0, p1 = 0, len(s)-1
        while p0 < p1:
            if (p0 < p1 and s[p0] != s[p1]):
                return False

            p0 += 1
            p1 -= 1

        return True

    def isPalindrome(self, s: str) -> bool:
        s = "".join(filter(str.isalnum, s)).lower()
        return s == s[::-1]



s = "A man, a plan, a canal: Panama"
# s = "race a car"
# s = " "
# s = "0P"
print(Solution().isPalindrome(s))