class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pairs = {'(':')', '[':']', '{':'}'}
        keys = pairs.keys()

        for c in s:
            if c in keys:
                stack.append(c)
            else:
                if len(stack) == 0 or pairs[stack.pop()] != c:
                    return False
        
        return not stack
            