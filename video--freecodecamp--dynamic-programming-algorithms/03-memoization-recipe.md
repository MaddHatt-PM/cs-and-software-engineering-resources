# Alvin's Memoization Recipe
1. Make it work.
    - Visualize the problem as a tree.
    - Identify the base cases of the problem.
    - Implement the tree using recursion.
    - Test and ensure the approach works for smaller arguments.
2. Make it efficient.
    - Add a memo object
        - Using a default argument.
        - Using a language which allows nested functions to access variables in the higher scope (python).
    - Add a base case to return memo values.
    - For new computed values, store them into the memo.

Note: Coming up with the brute force solution will likely be more difficult than adding the memoization.