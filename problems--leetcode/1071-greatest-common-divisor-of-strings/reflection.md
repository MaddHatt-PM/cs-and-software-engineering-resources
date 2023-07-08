This problem was harder than expected.
Initially I had a nested double for-loop.
After reading through other solutions, I realized that there would never be a cause where offsetting the start of a substring would yield a correct answer.
My solution is more brute force than elegance.
An optimal solution would only look for the possible factors of the lengths of the two strings rather than the contents of the strings themselves.