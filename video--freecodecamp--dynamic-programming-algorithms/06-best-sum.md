# BestSum
Write a function `bestSum(targetSum, numbers)` that takes in a targetSum and an array of numbers as arguments.  
The function should return an array containing the shortest combination of numbers that ad up to exactly the targetSum.  
If there is a tie for the shortest combination, you may return any one of the shortest.

## Examples
bestSum(7[5, 3, 4, 7]) -> [7]  
bestSum(8, [2, 3, 5]) -> [3, 5]  
bestSum(0, [1, 2, 3]) -> []  
bestSum(5, [2, 3]) -> null

---

## Algorithm Approach
As we are trying to find the best out of all shortest combinations, we will need to go down all possible routes to ensure that we have not missed the best shortest combination. As we are iterating through all possible combinations, we will want to bubble up the shortest combination.

## Initial brute force
```javascript
const bestSum = (targetSum, numbers) => {
    if (targetSum === 0) return [];
    if (targetSum < 0) return null;
    let shortestCombination = null;

    for (let n of numbers) {
        const remainder = targetSum - n;
        const remainderCombination = bestSum(remainder, numbers);
        if (remainderCombination !== null) {
            const combination = [...remainderCombination, n];
            if (shortestCombination === null || combination.length > shortestCombination.length) {
                shortestCombination = combination;
            }
        }
    }

    return shortestCombination;
}
```

Complexities:
- Time Complexity: $O(n^m \times m)$ where $m$ is the `targetSum` and also the height of the tree $h$.
- Space Complexity: $O(h^2)$ as for each depth of the recursion call stack we go, we will be storing an array in each call stack.

## Memoization
```javascript
const bestSum = (targetSum, numbers, memo = {}) => {
    if (targetSum in memo) return memo[targetSum];
    if (targetSum === 0) return [];
    if (targetSum < 0) return null;
    let shortestCombination = null;

    for (let n of numbers) {
        const remainder = targetSum - n;
        const remainderCombination = bestSum(remainder, numbers);
        if (remainderCombination !== null) {
            const combination = [...remainderCombination, n];
            if (shortestCombination === null || combination.length > shortestCombination.length) {
                shortestCombination = combination;
            }
        }
    }

    memo[targetSum] = shortestCombination;
    return shortestCombination;
}
```

Complexities:
- Time Complexities: $O(n^m \times m) \to O(n \times m^2)$, read as polynomial complexity.
- Space Complexities: $O(m^2) \to O(m^2)$ as we still using the same amount of space but we are using it more efficiently with our memo object.