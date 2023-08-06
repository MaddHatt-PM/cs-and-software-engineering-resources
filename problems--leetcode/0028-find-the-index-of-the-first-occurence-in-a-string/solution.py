class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if len(haystack) < len(needle):
            return -1

        p0 = 0
        while p0 < len(haystack):
            if haystack[p0] == needle[0]:
                for i in range(len(needle)):
                    if not (p0+i < len(haystack)):
                        break

                    if haystack[p0+i] != needle[i]:
                        break
                        
                    if i == len(needle) - 1:
                        return p0
            p0 += 1
        return -1