# Valid Sudoku - Amazon Interview Question - Leetcode 36 - Python
## Reading the Problem
Determine if a partially filled `9x9` Sudoku board is valid by the following rules:
- Each row cannot contain duplicates
- Each column cannot contain duplicates
- Each of the `3x3` sub-boards cannot contain duplicates 

Note: Do not complete the Sudoku board, only determine validity based off the filled in values.
Therefore, it may be obvious that a board is not solvable, but it may fit the criteria for a valid board.

As this problem involves testing duplicates with specific criteria, then we can use a hashset.
The worst case time complexity of our solution will be O(9^2) as we will need to iterate through the at most once.
For space complexity, we will need a hashset for the rows, columns, and sub-boards.

## Drawing Explanation
While the rows and columns are straight-forward, the sub-boards are trickier.
From each coordinate (r,c), we will need to relate the coordinate the sub-board key.

Notice that with integer division, the result is floored to an int. (ie: 2 // 3 = 0)
Recall that a tuple can be a key for a hashset.
Therefore our rows and columns will be 

As we iterate through the board we will need to check for each value to be empty and if it is not presently in the rows, columns, squares hashset.

## Coding Explanation
```python
from typing import List
from collections import defaultdict

class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = defaultdict(set)
        cols = defaultdict(set)
        sqrs = defaultdict(set)

        for r in range(9):
            for c in range(9):
                if board[r][c] == '.':
                    continue

                elif (board[r][c] in rows[r] or
                      board[r][c] in cols[c] or
                      board[r][c] in sqrs[(r // 3, c // 3)]):
                    return False

                rows[r].add(board[r][c])
                cols[c].add(board[r][c])
                sqrs[(r // 3, c // 3)].add(board[r][c])
        
        return True
```