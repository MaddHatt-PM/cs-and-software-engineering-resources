from typing import List


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        i = len(digits) - 1
        while i >= 0:
            digits[i] += 1
            if digits[i] != 10:
                return digits
            else:
                digits[i] = 0
            i -= 1

        digits[0] = 1
        digits.append(0)
        return digits


# digits = [1,2,3]
# digits = [4,3,2,1]
# digits = [9]
# digits = [9,9,9]
digits = [1]
print(Solution().plusOne(digits))