class Solution:
    # Combinatorics Approach
    # def uniquePaths(self, m: int, n: int) -> int:
    #     return factorial(m+n-2) // factorial(m-1) // factorial(n-1)

    def uniquePaths(self, m:int, n:int) -> int:
        dp = [[1] * n for _ in range(m)]

        for c in range(1, m):
            for r in range(1, n):
                dp[c][r] = dp[c-1][r] + dp[c][r-1]
                
        return dp[-1][-1] 