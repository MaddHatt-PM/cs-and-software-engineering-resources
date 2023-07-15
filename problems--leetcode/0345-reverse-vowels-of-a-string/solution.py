class Solution:
    def reverseVowels(self, s: str) -> str:
        chars = list(s)
        vowels = set('aeiouAEIOU')
        pos = []
        for i in range(len(chars)):
            if chars[i] in vowels:
                pos.append(i)
        
        a, b = 0, len(pos) - 1
        while a < b:
            chars[pos[a]], chars[pos[b]] = chars[pos[b]], chars[pos[a]]
            a += 1
            b -= 1

        return ''.join(chars)

s = "leetcode"
print(Solution().reverseVowels(s)) 