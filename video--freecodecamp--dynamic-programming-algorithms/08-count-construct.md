# Count Construct
Write a function `countConstruct(target, wordBank)` that accepts a target string and an array of strings.  
The function should return the number of ways that the `target` can be constructed by concatenating elements of the `wordBank` array.  
You may reuse elements of `wordBank` as many times as needed.

## Examples
countConstruct(abcdef, [ab, abc, cd, def, abcd]) $\to$ 1  
countConstruct(purple, [purp, p, ur, le, purpl]) $\to$ 2

## Algorithm Approach
Similar to [canConstruct](./07-can-construct.md), we will prefix match and slice until we end up with an empty `target`. Once an empty `target` is found, we are at the end of our decision tree and can return a `1`. We will accumulate these `1`s and bubble up our count to the initial caller. 

## Initial Brute Force
```javascript
const countConstruct = (target, wordBank) => {
    if (target === "") return 1;

    let count = 0;
    for (let word of wordBank) {
        if (target.indexOf(word) == 0) {
            const suffix = target.slice(word.length);
            count += countConstruct(suffix);
        }
    }

    return count;
}
```
Complexities:  
Time: $O(n^m \times m)$  
Space: $O(m^2)$

## Memoized Version
```javascript
const countConstruct = (target, wordBank, memo={}) => {
    if (target in memo) return memo[target];
    if (target === "") return 1;

    let count = 0;
    for (let word of wordBank) {
        if (target.indexOf(word) == 0) {
            const suffix = target.slice(word.length);
            count += countConstruct(suffix);
        }
    }

    memo[target] = count;
    return count;
}
```
Time Complexity: $O(n^m \times m) \to O(n \times m^2)$ as we gained an m from the checked slice.  
Space Complexity: $O(m^2) \to O(m^2)$