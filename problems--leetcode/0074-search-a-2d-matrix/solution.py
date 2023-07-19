from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # Binary Search - Range
        l, r = 0, len(matrix) - 1
        while l <= r:
            m = (l + r) // 2
            if target < matrix[m][0]:
                r = m - 1
            elif matrix[m][-1] < target:
                l = m + 1
            elif matrix[m][0] <= target and target <= matrix[m][-1]:
                # Binary Search - Ordinary
                l2, r2 = 0, len(matrix[m]) - 1
                while l2 <= r2:
                    m2 = (l2 + r2) // 2
                    if target < matrix[m][m2]:
                        r2 = m2 - 1
                    elif  matrix[m][m2] < target:
                        l2 = m2 + 1
                    elif target == matrix[m][m2]:
                        return True

                return False

        return False